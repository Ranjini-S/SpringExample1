package com.DanskeIt.Example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

		Person person = (Person) context.getBean("person");
		System.out.println(person);
		context.close();
	}

}
