/**
 * @author Paul Nwabudike
 * chindinma@gmail.com
 * Since: 11:59:55 AM May 23, 2023
 * Copyright (c) 2023.  
 */
package com.patterns.creational.factory.example1;

/**
 * design-patterns-java/com.patterns.creational.factory.example1/AnimalFactory.java/AnimalFactory
 * 
 */
abstract class AnimalFactory {
	//This is the Factory Method
	//Note:  I defer the instantiation process to the subclasses.
	protected abstract Animal createAnimal();

}
