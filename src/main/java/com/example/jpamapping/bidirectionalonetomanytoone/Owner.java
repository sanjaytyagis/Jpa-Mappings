package com.example.jpamapping.bidirectionalonetomanytoone;
import jakarta.persistence.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
     //FetchType.LAZY will first load the main entity ( Owner), then the related entity (Blog) on demand.
    // FetchType.EAGER will load both Owner and Blog at a time using Joins
     
 		Owner has blogs - One To Many
 		blogs has an owner - Many To One
 		
 		The Owner entity has a One-To-Many relationship with the Blog entity in this case. 
 		We used mappedBy with the name owner in the @OneToMany annotation
 		 — this actually refers to the owner property in the Blog entity. 
 		As a result, the owner is now referring to the blog entity.
 */

@Entity
@Table(name = "OWNER_DETAILS")
public class Owner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    
    //FetchType.LAZY will first load the main entity ( Owner), then the related entity (Blog) on demand.
    // FetchType.EAGER will load both Owner and Blog at a time using Joins
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Blog> blogList;
    
    public Owner() { }

    public Owner(String name, String email) {
        this.name = name;
        this.email = email;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Blog> getBlogList() {
		return blogList;
	}

	public void setBlogList(List<Blog> blogList) {
		this.blogList = blogList;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", email=" + email + ", blogList=" + blogList + "]";
	}

}
