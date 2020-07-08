/**
 * 
 */
package model;

import adapterServices.FlyNoWay;
import constant.AppConstant;
import service.SingService;
import utils.SoundEnums;

/**
 * @author arvind
 *
 */
public class Chicken extends Bird implements FlyNoWay {

	public Chicken() {
		super(new SingService(SoundEnums.CHICKEN));
	}

	public Chicken(SingService singService) {
		super(singService);
	}
	
	@Override
    public void canWalk() {
        super.canWalk();
    }

    @Override
    public void canFly() {
        System.out.println(AppConstant.I_CANT_FLY);
    }

}
