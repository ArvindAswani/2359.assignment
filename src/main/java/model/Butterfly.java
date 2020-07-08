/**
 * 
 */
package model;

import adapterServices.Fly;
import adapterServices.FlyNoWay;
import adapterServices.Sound;
import constant.AppConstant;
import service.SingService;
import utils.SoundEnums;

/**
 * @author arvind
 *
 */
public class Butterfly extends Insect {
    private Insect state = new CaterpillarState(new SingService(SoundEnums.CATERPILLAR));

    public Butterfly() {
        super(new SingService(SoundEnums.CATERPILLAR));
    }
    public void transform() {
        state = new ButterflyState(new SingService(SoundEnums.NO_SOUND));
    }
    
    @Override
    public void canFly() {
        state.canFly();
    }

    @Override
    public void callSound() {
        state.callSound();
    }

    @Override
    public void canWalk() {
        state.canWalk();
    }

    
    private class ButterflyState extends Insect implements Fly, Sound {

        public ButterflyState(SingService singService) {
            super(singService);
        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            super.canFly();
        }
    }

    private class CaterpillarState extends Insect implements Sound, FlyNoWay {

        public CaterpillarState(SingService singService) {
            super(singService);

        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            System.out.println(AppConstant.I_CANT_FLY);
        }
    }
}
