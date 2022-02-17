package com.javaProgram.Spring.SpringSetup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.javaProgram.Spring.SpringSetup.Laptop;


@Component("aStudent")
@PropertySource("classpath:test.properties")
public class Student {
	
	//print value using test.properties file
	
		@Value("${userName}")
		private String name;
		
		@Value("${userId}")
		private String id;
		
		@Autowired //DI - Directly on the field
		@Qualifier("theLaptop")
		private Laptop laptop;
		
		public Student() {
			
		}
		
		public Student(int int1, String string, String string2) {
			// TODO Auto-generated constructor stub
		}

		public void study() {
		System.out.println("Student's studied...");
		System.out.println("I have used the laptop:");
		System.out.println(laptop);
		
		System.out.println();
		
	System.out.println("Name : " + name + ", ID : " + id);

			
		}

	

}
