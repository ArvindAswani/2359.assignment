/**
 * 
 */
package model;

import adapterServices.Fly;
import constant.AppConstant;
import service.SingService;
import utils.SoundEnums;

/**
 * @author arvind
 *
 */
public class Parrot extends Bird implements Fly {
    public Parrot() {
        super(new SingService(SoundEnums.DEFAULT));
    }

    public Parrot(SingService singService) {
        super(singService);
    }

    public void canFly() {
        System.out.println(AppConstant.I_AM_FLYING);
    }
}
