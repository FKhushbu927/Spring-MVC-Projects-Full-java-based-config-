package com.khushbu.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //configure rootContext
        AnnotationConfigWebApplicationContext rootContext=new AnnotationConfigWebApplicationContext();
        rootContext.register(RootConfig.class);
        rootContext.refresh();
        //manage the life cycle of rootContext
        servletContext.addListener(new ContextLoaderListener(rootContext));
        //configure WEB MVC and MVC related bean
        AnnotationConfigWebApplicationContext servletRegister=new AnnotationConfigWebApplicationContext();
        servletRegister.register(ServletConfig.class);
        ServletRegistration.Dynamic servletRegistration=servletContext.addServlet("servlet",new DispatcherServlet(servletRegister));
        //addmapping
        servletRegistration.addMapping("/");
        servletRegistration.setLoadOnStartup(1);

    }
}
