/**
 * 
 */
package model;

import adapterServices.SwimmBehavior;
import constant.AppConstant;

/**
 * @author arvind
 *
 */
public class Dolphin extends Animal implements SwimmBehavior {
	
	
	public void canSwim() {
		System.out.println(AppConstant.I_AM_SWIMMING);
	}

}
