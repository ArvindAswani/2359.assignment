/**
 * 
 */
package model;

import adapterServices.Sound;
import adapterServices.Walkable;
import constant.AppConstant;
import service.SingService;
import utils.SoundEnums;

/**
 * @author arvind
 *
 */
public abstract class Mammal extends Animal implements Walkable, Sound {

	
	 private SingService singService;

	    public Mammal() {
	        this.singService = new SingService(SoundEnums.DEFAULT);
	    }

	    public Mammal(SingService singService) {
	        this.singService = singService;
	    }

	    public void callSound() {
	        singService.makeSound();
	    }

	    public void canWalk() {
	        System.out.println(AppConstant.I_AM_WALKING);
	    }
}
