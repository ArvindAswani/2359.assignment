/**
 * 
 */
package com9.assignment.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import controller.AnimalController;
import model.Animal;
import model.Bird;
import model.Butterfly;
import model.Cat;
import model.Chicken;
import model.Clownfish;
import model.Dog;
import model.Dolphin;
import model.Duck;
import model.Fish;
import model.Frog;
import model.Parrot;
import model.Rooster;
import model.Shark;

/**
 * @author arvind
 *
 */
public class AnimalControllerTest {
	
	 @Test
	    void getFlyingAnimalCount() {
	        Animal[] animals = new Animal[]{
	                new Bird(),
	                new Duck(),
	                new Chicken(),
	                new Rooster(),
	                new Parrot(),
	                new Fish(),
	                new Shark(),
	                new Clownfish(),
	                new Dolphin(),
	                new Frog(),
	                new Dog(),
	                new Butterfly(),
	                new Cat()
	        };
	        int flyingAnimalCount = new AnimalController().getFlyingAnimalCount(animals);
	        assertEquals(flyingAnimalCount, 6);
	    }

}
