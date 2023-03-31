/**
 * @author Paul Nwabudike
 * chindinma@gmail.com
 * Since: 1:36:15 AM Mar 25, 2023
 * Copyright (c) 2023.  
 */
package com.patterns.creational.simplefactory;

/**
 * design-patterns-java/com.patterns.creational.simplefactory/Dog.java/Dog
 * 
 */
public class Dog implements Animal {
	public Dog() {
		System.out.println("\n Dog is created");

	}

	@Override
	public void displayBehaviour() {
		System.out.println("\n It says: woof woof");
		System.out.println("\n Dog Barks");

	}

}
