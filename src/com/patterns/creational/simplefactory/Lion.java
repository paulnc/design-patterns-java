/**
 * @author Paul Nwabudike
 * chindinma@gmail.com
 * Since: 1:36:15 AM Mar 25, 2023
 * Copyright (c) 2023.  
 */
package com.patterns.creational.simplefactory;

/**
 * design-patterns-java/com.patterns.creational.simplefactory/Lion.java/Lion
 * 
 */
public class Lion implements Animal {
	public Lion() {
		System.out.println("\n Lion is created");

	}

	@Override
	public void displayBehaviour() {
		System.out.println("\n It says: Rarr Rarr Rarr");
		System.out.println("\n Lion Roars");

	}

}
