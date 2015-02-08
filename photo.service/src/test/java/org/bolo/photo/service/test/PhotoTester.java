package org.bolo.photo.service.test;

import org.bolo.photo.service.PrimoServizio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhotoTester {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PrimoServizio serv = ctx.getBean(PrimoServizio.class);
		serv.servizio();
		
	}

}
