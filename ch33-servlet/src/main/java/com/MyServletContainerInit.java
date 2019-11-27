package com;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

public class MyServletContainerInit implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic servletRegistration =
                servletContext.addServlet("first", new FistServlet());

        servletRegistration.addMapping("/first");
    }
}
