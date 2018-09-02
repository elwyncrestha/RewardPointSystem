package com.softwarica.config;

import java.util.EnumSet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.SessionTrackingMode;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author elwyn
 */
/**
 * equivalent to web.xml *
 */
public class WebServletConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext ctx) throws ServletException {
        AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
        webCtx.register(WebAppConfig.class);
        // prevent using URL Parameters for Session Tracking
        ctx.setSessionTrackingModes(EnumSet.of(SessionTrackingMode.COOKIE));
        webCtx.setServletContext(ctx);

        ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher", new DispatcherServlet(webCtx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
        
        ContextLoaderListener contextLoaderListener = new ContextLoaderListener(webCtx);
        ctx.addListener(contextLoaderListener);
        
        
        
    }

}
