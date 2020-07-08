/**
 * 
 */
package model;

import adapterServices.Fly;
import adapterServices.Swimm;
import constant.AppConstant;
import service.SingService;
import utils.SoundEnums;

/**
 * @author arvind
 *
 */
public class Duck extends Bird implements Swimm, Fly{
	
	 public Duck() {
	        super(new SingService(SoundEnums.DUCK));
	    }

	 @Override
	 public void canWalk() {
	        super.canWalk();
	    }
	
	public void canFly() {
        System.out.println(AppConstant.I_AM_FLYING);
    }
	
	@Override
    public void canSwim() {
        System.out.println(AppConstant.I_AM_SWIMMING);
    }

}
