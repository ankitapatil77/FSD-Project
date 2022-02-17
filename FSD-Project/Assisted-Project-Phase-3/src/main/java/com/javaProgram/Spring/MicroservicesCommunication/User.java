package com.javaProgram.Spring.MicroservicesCommunication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User {
	


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer Id;
    @Column
    private String name;
    @Column
    private String Location;

    
    public User() {
		super();
	}

	public User(Integer userId, String name, String location) {
		super();
		this.Id = userId;
		this.name = name;
		this.Location = location;
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
