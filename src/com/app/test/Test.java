package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.satya.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
		Object ob=ac.getBean("sObj");
		Student s=(Student)ob;
		System.out.println(s);
		System.out.println("dgdfdfh");

	}

}
