package com.javaProgram.Spring.Custome_and_defaultHandling;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class App {
	
	 public static void main( String[] args )
	    {
	    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
	    	
	    	jdbcOperation op = context.getBean("op", jdbcOperation.class);
	    	op.work();

}
}