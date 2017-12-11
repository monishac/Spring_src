package com.dp.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println();
		System.out.println("Int");
		Employee employeeint = (Employee) applicationContext.getBean("employeeint");
		employeeint.displayAll();
		
		System.out.println("String");
		Employee employeeString = (Employee) applicationContext.getBean("employeestring");
		employeeString.displayAll();
	
//		System.out.println("Both");
//		Employee employeeboth = (Employee) applicationContext.getBean("employeeboth");
//		employeeboth.displayAll();
		System.out.println("None");
		
		Employee employeenone = (Employee) applicationContext.getBean("employeenone");
		employeenone.displayAll();
		
		System.out.println("ALL");
		Employee employeeall = (Employee) applicationContext.getBean("employeeall");
		employeeall.displayAll();
	}

}
