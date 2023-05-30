/**
 * @author Paul Nwabudike
 * chindinma@gmail.com
 * Since: 12:17:04 PM May 23, 2023
 * Copyright (c) 2023.  
 */
package com.patterns.creational.factory.example1;

/**
 * design-patterns-java/com.patterns.creational.factory.example1/Client.java/Client
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("**** Factory Method Patttern ****");
		AnimalFactory factory;
		Animal animal;

		// Creating a Lion and displaying its behavior
		// using LionFactory
		factory = new LionFactory();
		animal = factory.createAnimal();
		animal.displayBehaviour();
		
		
		// Creating a Dog and displaying its behavior
		// using LionFactory
		factory = new DogFactory();
		animal = factory.createAnimal();
		animal.displayBehaviour();

	};

}
