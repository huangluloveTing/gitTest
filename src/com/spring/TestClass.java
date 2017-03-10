package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestClass {

	private static ClassPathXmlApplicationContext ac;

	public static void main(String[] args) {

		System.out.println("main test");
		
		ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Service service = (Service) ac.getBean("serviceBean");
		service.serviceTest("huanglu");
		System.out.println("service " + service.getClass().getName().hashCode());
		ac.destroy();
		ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Service service1 = (Service) ac.getBean("serviceBean");
		System.err.println("service1 "+ service1.getClass().getName().hashCode());
		
		
		COntroller cOntroller = (COntroller) ac.getBean("controller");
		cOntroller.control();
	}

}
