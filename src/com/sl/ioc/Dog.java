package com.sl.ioc;

import org.springframework.stereotype.Component;

@Component("huskyDog")
public class Dog //extends Animal 
{

	private Breed breed;
	
	private String name;
	
	private Color color;

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void Wang() {
		System.out.println("ÍôÍôÍô");
	}
	
}
	





