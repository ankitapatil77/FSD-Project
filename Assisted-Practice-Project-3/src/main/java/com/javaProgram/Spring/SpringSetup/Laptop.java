package com.javaProgram.Spring.SpringSetup;

public class Laptop {
private String name;
	
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", company=" + company + ", ram=" + ram + "]";
	}

	private String company;
	
	private Integer ram;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}



}
