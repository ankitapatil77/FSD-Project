package com.javaProgram.hibernet.log4j.LazyHibernet;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.query.criteria.internal.OrderImpl;

import com.javaProgram.hibernate.hibernateAnnotation.productdetails;

public class ProductDetailsLazyHibernet {

    @Id
    @GeneratedValue
    @Column(name = "ProductId")
    private Long ProductId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<product> productDetail = new HashSet();

    // standard setters and getters
    // also override equals and hashcode

}
