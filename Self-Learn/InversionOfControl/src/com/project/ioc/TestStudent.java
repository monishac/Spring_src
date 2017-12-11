package com.project.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestStudent {

	public static void main(String[] args) {
		
		//BeanFactory
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Student student = (Student) beanFactory.getBean("studentbeanMonish");
		student.displayName();
		
		
		/*//ApplicationContext
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) applicationContext.getBean("studentbeanAditya");
		student.displayName();
		*/
	}

}
