/**
 * @author Paul Nwabudike
 * chindinma@gmail.com
 * Since: 2:25:37 AM Mar 25, 2023
 * Copyright (c) 2023.  
 */
package com.patterns.creational.simplefactory;

/**
 * design-patterns-java/com.patterns.creational.simplefactory/Client.java/Client
 * 
 */
public class Client {

	
	public static void main(String[] args) {
		
		System.out.println("***Simplle Fsctory Demonstration***");
		AnimalFactory factory = new AnimalFactory();
		Animal animal1 = factory.createAnimal("dog");
		animal1.displayBehaviour();
		
		Animal animal2 = factory.createAnimal("lion");
		animal2.displayBehaviour();
		

	}

}
