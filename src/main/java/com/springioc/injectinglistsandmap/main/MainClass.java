package com.springioc.injectinglistsandmap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.injectinglistsandmap.beans.Person;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationcontext.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person.getCars());
		System.out.println(person.getDetails());
	}
}
