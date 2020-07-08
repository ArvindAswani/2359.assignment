/**
 * 
 */
package model;

import constant.AppConstant;

/**
 * @author arvind
 *
 */
public class Clownfish extends Fish {


    @Override
    public String bodySize() {
        return "small";
    }

    @Override
    public String bodyColor() {
        return "orange";
    }

    public void makeClownFish() {
        System.out.println(AppConstant.CLOWNFISH_MAKES_JOKES);
    }

}
