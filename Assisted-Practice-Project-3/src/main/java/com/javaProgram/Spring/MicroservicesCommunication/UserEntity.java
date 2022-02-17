package com.javaProgram.Spring.MicroservicesCommunication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class UserEntity {
	


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer Id;
    @Column
    private String name;
    @Column
    private String Location;
    
	public UserEntity() {
		super();
	}
	public UserEntity(Integer id, String name, String location) {
		super();
		Id = id;
		this.name = name;
		Location = location;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}

   
   


}
