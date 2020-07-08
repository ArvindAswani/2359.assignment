/**
 * 
 */
package model;

import adapterServices.Fly;
import adapterServices.Sound;
import adapterServices.Walkable;
import constant.AppConstant;
import service.SingService;

/**
 * @author arvind
 *
 */
public class Insect extends Animal implements Fly, Walkable, Sound {
	
	 private SingService singService;

	    public Insect(SingService singService) {
	        this.singService = singService;
	    }
	    

	@Override
	public void callSound() {
		singService.makeSound();
		
	}

	@Override
	public void canWalk() {
		  System.out.println(AppConstant.I_AM_WALKING);
		
	}

	@Override
	public void canFly() {
		System.out.println(AppConstant.I_AM_FLYING);
		
	}

}
