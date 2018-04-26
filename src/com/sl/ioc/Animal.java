package com.sl.ioc;
import org.springframework.stereotype.Component;


@Component("animalD")
public class Animal {
	
	private Dog dog;
	
	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Animal(Dog dog) {
		this.dog = dog;
	}
		
    public void AnimalAction()
    {
    	dog.Wang();
    }
   
	
}
