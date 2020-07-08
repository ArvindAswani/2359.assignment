/**
 * 
 */
package model;

import adapterServices.BodyCharacteristics;
import adapterServices.Sound;
import adapterServices.SwimmBehavior;
import adapterServices.Walkable;
import constant.AppConstant;

/**
 * @author arvind
 *
 */
public class Fish extends Animal implements SwimmBehavior, BodyCharacteristics,Walkable,Sound {

	@Override
	public String bodySize() {

		return null;
	}

	@Override
	public String bodyColor() {

		return null;
	}

	@Override
	public void canSwim() {
		System.out.println(AppConstant.I_AM_SWIMMING);

	}

	@Override
	public void canWalk() {
		System.out.println(AppConstant.FISH_CANT_WALK);
		
	}

	@Override
	public void callSound() {
		System.out.println(AppConstant.NO_SOUND);
		
	}

}
