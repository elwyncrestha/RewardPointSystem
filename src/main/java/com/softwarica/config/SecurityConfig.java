package com.softwarica.config;

import com.softwarica.customservices.SuperUser;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.session.HttpSessionEventPublisher;

/**
 *
 * @author elwyn
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // notifies Spring Security session registry when the session is destroyed.
    @Bean
    public HttpSessionEventPublisher httpSessionEventPublisher() {
        return new HttpSessionEventPublisher();
    }

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // in-memory authentication for super user
        auth.inMemoryAuthentication().withUser(SuperUser.getUName()).password(SuperUser.getUCode()).roles("ADMIN");
        auth.inMemoryAuthentication().withUser("elvin").password(passwordEncoder().encode("elvin")).roles("ADMIN");

        // jdbc authentication
        String usersByUsernameQuery = "select userUsername, userPassword, active from user_tbl where userUsername=?";
        String authoritiesByUsernameQuery = "select u.userUsername, ut.authority from user_tbl u, usertype_tbl ut where u.userTypeId=ut.userTypeId and u.userUsername = ?";
        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(usersByUsernameQuery).authoritiesByUsernameQuery(authoritiesByUsernameQuery);
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                .and()
                .formLogin()
                .usernameParameter("username").passwordParameter("password").loginPage("/login")
                .loginProcessingUrl("/perform_login").defaultSuccessUrl("/admin/display/home")
                .failureUrl("/login?failure").permitAll()
                .and()
                .logout()
                .logoutUrl("/logout").logoutSuccessUrl("/login")
                .invalidateHttpSession(true).deleteCookies("JSESSIONID")
                .and()
                .csrf()
                .and()
                .exceptionHandling().accessDeniedPage("/403")
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .maximumSessions(2)
                .expiredUrl("/login");
        http.sessionManagement().invalidSessionUrl("/login");
        http.sessionManagement().sessionFixation().migrateSession();
        // WebAppConfig: prevent using URL Parameters for Session Tracking
    }

}
