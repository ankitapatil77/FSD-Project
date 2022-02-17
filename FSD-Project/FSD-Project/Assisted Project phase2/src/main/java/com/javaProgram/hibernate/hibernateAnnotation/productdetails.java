package com.javaProgram.hibernate.hibernateAnnotation;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;  
import javax.persistence.Table;  
  
@Entity  
@Table(name= "productdetails")   

public class productdetails {
	

    @Id @GeneratedValue   
    @Column(name = "ProductId")
    private long ProductId;
    
    @Column(name = "ProductName")
    private String ProductName;
    
    @Column(name = "ProductPrice")
    private BigDecimal ProductPrice;
    
    @Column(name = "date_added")
    private Date dateAdded;  
        
    public long getID() {return this.ProductId; }
    public String getName() { return this.ProductName;}
    public BigDecimal getPrice() { return this.ProductPrice;}
    public Date getDateAdded() { return this.dateAdded;}
    
    public void setID(long id) { this.ProductId = id;}
    public void setName(String name) { this.ProductName = name;}
    public void setPrice(BigDecimal price) { this.ProductPrice = price;}
    public void setDateAdded(Date date) { this.dateAdded = date;}    


}
