/**
 * @author Paul Nwabudike
 * chindinma@gmail.com
 * Since: 1:56:28 AM Mar 25, 2023
 * Copyright (c) 2023.  
 */
package com.patterns.creational.simplefactory;

/**
 * design-patterns-java/com.patterns.creational.simplefactory/AnimalFactory.java/AnimalFactory
 * 
 */
public class AnimalFactory {

	public Animal createAnimal(String animalType) {
		Animal animal;
		if (animalType.equals("dog")) {
			animal = new Dog();

		} else if (animalType.equals("lion")) {
			animal = new Lion();
		} else {

			System.out.println("You can't create either a 'dog' or a 'lion'");
			throw new IllegalArgumentException("Unknown animaal cannot be instantiated");
		}

		return animal;
	}

}
