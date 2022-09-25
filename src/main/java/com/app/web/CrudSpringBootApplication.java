package com.app.web;

import com.app.web.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}

	@Autowired
	private Repositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
	 /*
		Estudiante estudiante1 = new Estudiante("Christian","Ramirez","cris20@gmail.com");
	    repositorio.save(estudiante1);
	    
	    Estudiante estudiante2 = new Estudiante("Andre","Carrillo","andrecar20@gmail.com");
	    repositorio.save(estudiante2);
	   */ 
	}

}
