package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@PropertySource("classpath:app.properties")
@ComponentScan("com.app")
public class AppConfig {
	@Autowired
	private Environment env;
	@Bean
	public InternalResourceViewResolver ivr() {
		InternalResourceViewResolver v=new InternalResourceViewResolver();
		v.setPrefix(env.getProperty("spring.mvc.prefix"));
		v.setSuffix(env.getProperty("spring.mvc.suffix"));
		return v;
	}
	
	
}