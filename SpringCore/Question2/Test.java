package com.springcore.collection;

	import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to disable warning
		ApplicationContext context=new ClassPathXmlApplicationContext("src/main/resources/NewFile.xml");
		emp emp1=(emp)context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
		
	}

}

