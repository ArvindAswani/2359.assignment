/**
 * 
 */
package model;

import adapterServices.Fly;
import adapterServices.Sound;
import adapterServices.Walkable;
import constant.AppConstant;
import service.SingService;
import utils.SoundEnums;

/**
 * @author arvind
 *
 */
public class Bird extends Animal implements Walkable, Sound, Fly {

	
	private SingService singService;

    public Bird() {
        this.singService = new SingService(SoundEnums.DEFAULT);
    }

    public Bird(SingService singHelper) {
        this.singService = singHelper;
    }

    public void callSound() {
    	singService.makeSound();
    }

    public void canWalk() {
        System.out.println(AppConstant.I_AM_WALKING);
    }


    public void canFly() {
        System.out.println(AppConstant.I_AM_FLYING);
    }
	

}
