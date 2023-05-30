package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int aid;
	private String aname;
	private String tech;
	
	@Autowired  //Alien is dependent on laptop; to connect use @autowired; search by type 
	@Qualifier("lap1") // search by name
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println("Alien object created");
	}
	
	
	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("Alien show");
		laptop.compile();
	}
}
