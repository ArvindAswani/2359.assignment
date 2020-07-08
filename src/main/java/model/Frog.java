/**
 * 
 */
package model;

import adapterServices.SoundBehavior;
import adapterServices.SwimmBehavior;
import adapterServices.Walkable;
import constant.AppConstant;
import service.SingService;
import utils.SoundEnums;

/**
 * @author arvind
 *
 */
public class Frog extends Animal implements SwimmBehavior, Walkable, SoundBehavior {
    SingService singService;

    public Frog() {
    	singService = new SingService(SoundEnums.DEFAULT);
    }

    public Frog(SingService singService) {
    	singService = singService;
    }

    public void callSound() {
    	singService.makeSound();
    }

    public void canSwim() {
        System.out.println(AppConstant.I_AM_SWIMMING);
    }

    public void canWalk() {
        System.out.println(AppConstant.I_AM_WALKING);
    }

}
