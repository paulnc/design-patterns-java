/**
 * @author Paul Nwabudike
 * chindinma@gmail.com
 * Since: 12:08:31 PM May 23, 2023
 * Copyright (c) 2023.  
 */
package com.patterns.creational.factory.example1;

/**
 * design-patterns-java/com.patterns.creational.factory.example1/DogFactory.java/DogFactory
 * 
 */
public class DogFactory extends AnimalFactory{
	
	//Creating and returning a Dog Instance

	@Override
	protected Animal createAnimal() {
		return new Dog();
	}

}
