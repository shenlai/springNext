package com.sl.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class AnimalConfig {
	
	/*@Bean("dog")
	@Conditional(DogCondition.class)
	public Dog DogInstance() {
		return new Dog();
	}*/
	
	/*@Bean("cat")
	@Conditional(CatCondition.class)
	public Cat CatInstance() {
		return new Cat();
	}*/
	
	
	

	/*@Bean("animal")
	public Animal GetAnimal(Dog dog)
	{
		return new Animal(dog);
	}*/
}
