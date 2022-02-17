package com.javaProgram.hibernet.log4j.LazyHibernet;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table (name = "productdetails")
public class product {

	@Id
    @GeneratedValue
    @Column(name="ProductId")
    private Long ProductId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ProductId")
    private ProductDetailsLazyHibernet product;

    // standard setters and getters
    // also override equals and hashcode

}


 
