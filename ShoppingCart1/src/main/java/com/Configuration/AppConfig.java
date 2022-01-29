package com.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@EnableJpaRepositories
public class AppConfig {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver is = new InternalResourceViewResolver();
		is.setViewClass(JstlView.class);
		is.setPrefix("/WEB-INF/views/");
		is.setSuffix(".jsp");
		return is;
	}

}
