package com.sl.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {
	
	@Bean("dog")
	public Dog DogInstance() {
		return new Dog();
	}

	@Bean("animal")
	public Animal GetAnimal(Dog dog)
	{
		return new Animal(dog);
	}
}
