/**
 * @author Paul Nwabudike
 * chindinma@gmail.com
 * Since: 11:38:41 AM May 23, 2023
 * Copyright (c) 2023.  
 */
package com.patterns.creational.factory.example1;

/**
 * design-patterns-java/com.patterns.creational.factory.example1/Dog.java/Dog
 * 
 */
public class Dog implements Animal{
	public Dog(){
    System.out.println("\nA Dog is created.");
	}

	@Override
	public void displayBehaviour() {
		System.out.println("\n It says: woof woof");
		System.out.println("\n Dog Barks");
	} 
	
	
}
