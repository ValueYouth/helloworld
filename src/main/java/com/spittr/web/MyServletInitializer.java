package com.spittr.web;

import com.spittr.filter.MyFilter;
import com.spittr.web.servlet.MyServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyServletInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {
        // 注册servlet
        ServletRegistration.Dynamic myServlet = servletContext.addServlet("MyServlet", MyServlet.class);
        myServlet.addMapping("/custom/*");

        // 注册filter
        FilterRegistration.Dynamic myFilter = servletContext.addFilter("MyFilter", MyFilter.class);
        myFilter.addMappingForServletNames(null, false, "/custom/*");

    }
}
