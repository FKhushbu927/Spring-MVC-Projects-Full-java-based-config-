package com.khushbu.registrationForm.config;

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
       //config rootContext
        AnnotationConfigWebApplicationContext rootContext=new AnnotationConfigWebApplicationContext();
        rootContext.register(RootConfig.class);
        //manage the life of root Application context and
        servletContext.addListener(new ContextLoaderListener(rootContext));
        //config web MVC and register MVC related bean
        AnnotationConfigWebApplicationContext servletRegister=new AnnotationConfigWebApplicationContext();
        servletRegister.register(ServletConfig.class);

        ServletRegistration.Dynamic registration=servletContext.addServlet("servlet",new DispatcherServlet(servletRegister));
        //add maping
        registration.addMapping("/");
        //set loadon startup
        registration.setLoadOnStartup(1);
    }
}
