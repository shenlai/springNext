package com.sl.ioc;

import org.springframework.stereotype.Component;

@Component
public class Dog //extends Animal 
{

	private Breed breed;

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}
}





