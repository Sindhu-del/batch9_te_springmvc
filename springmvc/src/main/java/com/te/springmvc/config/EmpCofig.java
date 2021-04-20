package com.te.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.stereotype.Controller;

@Controller
public class EmpCofig {

	@Bean
	public LocalEntityManagerFactoryBean getFactory() {
		LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("spring");
		return bean;
		
	}

}
