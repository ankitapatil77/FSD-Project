package com.javaProgram.Spring.HTTPSSpringBoot;

public class ProductRepository {
	
	String fname="Ankita";
	String lname="Patil";
	String Country="India";
	String State="Maharashtra";
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}

}
