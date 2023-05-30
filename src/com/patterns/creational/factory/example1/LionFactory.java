/**
 * @author Paul Nwabudike
 * chindinma@gmail.com
 * Since: 12:13:42 PM May 23, 2023
 * Copyright (c) 2023.  
 */
package com.patterns.creational.factory.example1;

/**
 * design-patterns-java/com.patterns.creational.factory.example1/LionFactory.java/LionFactory
 * 
 */
public class LionFactory extends AnimalFactory{

	//Creating and returning a Lion instance
	@Override
	protected Animal createAnimal() {
		return new Lion();
	}

}
