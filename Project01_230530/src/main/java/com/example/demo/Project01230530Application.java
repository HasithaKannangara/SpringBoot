package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project01230530Application {

	public static void main(String[] args) {
		//SpringApplication.run(Project01230530Application.class, args);
		ConfigurableApplicationContext context=SpringApplication.run(Project01230530Application.class, args);
		
		
		//manually creating object using new
		//Alien a=new Alien();
		
		//dependancy injection
//		Alien a= context.getBean(Alien.class);//prehand creates an instance
//		a.show();
//		Alien a1= context.getBean(Alien.class);//creates only one object; see Alien.class constructor sysout
//		a1.show();
//		
//		Human h= context.getBean(Human.class);//no prehand instance have to call for new objects
//		h.show();
//		Human h1= context.getBean(Human.class);//creates two objects; because of 2 "new" objects h,h1 
//		h1.show();
		
		Alien a= context.getBean(Alien.class);//prehand creates an instance
		a.show();
		
	}

}
