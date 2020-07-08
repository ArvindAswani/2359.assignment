/**
 * 
 */
package model;

import service.SingService;
import utils.SoundEnums;

/**
 * @author arvind
 *
 */
public class Dog extends Mammal {
    public Dog() {
        super((new SingService(SoundEnums.DOG)));
    }

    public Dog(SingService singService) {
        super(singService);
    }

}
