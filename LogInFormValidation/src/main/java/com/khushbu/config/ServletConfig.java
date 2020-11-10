package com.khushbu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan (basePackages={"com.khushbu.controller"})
public class ServletConfig  implements WebMvcConfigurer {
    public void configureViewResolvers(ViewResolverRegistry registry){
             registry.jsp("/WEB-INF/views/",".jsp");
    }

}
