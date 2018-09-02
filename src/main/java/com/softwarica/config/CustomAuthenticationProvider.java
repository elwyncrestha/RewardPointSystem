package com.softwarica.config;

import com.softwarica.customservices.SuperUser;
import java.util.Collections;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 *
 * @author elwyn
 */
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{
    
    @Override
    public Authentication authenticate(Authentication auth) throws AuthenticationException
    {
        String username = auth.getName();
        String password = auth.getCredentials().toString();
        
        if(SuperUser.getUName().equals(username) && SuperUser.getUCode().equals(password)){
            return new UsernamePasswordAuthenticationToken(username, password, Collections.EMPTY_LIST);
        } else {
            throw new BadCredentialsException("External system authentication failed !!!");
        }
    }
    
    @Override
    public boolean supports(Class<?> auth) {
        return auth.equals(UsernamePasswordAuthenticationToken.class);
    }
}
