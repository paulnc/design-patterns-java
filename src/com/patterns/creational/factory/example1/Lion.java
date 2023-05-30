/**
 * @author Paul Nwabudike
 * chindinma@gmail.com
 * Since: 11:54:04 AM May 23, 2023
 * Copyright (c) 2023.  
 */
package com.patterns.creational.factory.example1;

/**
 * design-patterns-java/com.patterns.creational.factory.example1/Lion.java/Lion
 * 
 */
public class Lion implements Animal{
	public Lion() {
		System.out.println("\n Lion is created");

	}

	@Override
	public void displayBehaviour() {
		System.out.println("\n It says: Rarr Rarr Rarr");
		System.out.println("\n Lion Roars");

	}

}
