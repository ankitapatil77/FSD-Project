package com.javaProgram.Spring.SpringSetup;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaProgram.Spring.SpringSetup.Student;


public class App 
{
	public static void main( String[] args )
    {
    	
//    	Load the context
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
//    	Get a reference to the bean
    	Student student = context.getBean("aStudent", Student.class);
 
//    	Call methods on the bean
    	student.study();
    	

       
    }
    
}
