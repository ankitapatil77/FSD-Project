package com.javaProgram.hibernet.componentMapping;

import java.io.Serializable;

import org.apache.tomcat.jni.Address;

public class ComponentMapping implements Serializable{
	private int id;
	   private String firstName; 
	   private String lastName;   
	   private int salary;
	   private Address address;

	   public void Employee() {}
	   
	   public void Employee(String fname, String lname, int salary, Address address ) {
	      this.firstName = fname;
	      this.lastName = lname;
	      this.salary = salary;
	      this.address = address;
	   }
	   
	   public int getId() {
	      return id;
	   }
	   
	   public void setId( int id ) {
	      this.id = id;
	   }
	   
	   public String getFirstName() {
	      return firstName;
	   }
	   
	   public void setFirstName( String first_name ) {
	      this.firstName = first_name;
	   }
	   
	   public String getLastName() {
	      return lastName;
	   }
	   
	   public void setLastName( String last_name ) {
	      this.lastName = last_name;
	   }
	   
	   public int getSalary() {
	      return salary;
	   }
	   
	   public void setSalary( int salary ) {
	      this.salary = salary;
	   }

	   public Address getAddress() {
	      return address;
	   }
	   
	   public void setAddress( Address address ) {
	      this.address = address;
	   }

}
