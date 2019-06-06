package com.app.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.app.config.AppConfig;

public class AppInit  extends AbstractAnnotationConfigDispatcherServletInitializer{

	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {AppConfig.class};
	}

	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
}
