package model;

import constant.AppConstant;

/**
 * @author arvind
 *
 */
public class Shark extends Fish {

	
	@Override
    public String bodySize() {
        return "large";
    }

    @Override
    public String bodyColor() {
        return "grey";
    }

    public void canEat() {
        System.out.println(AppConstant.I_EAT_FISH);
    }
}
