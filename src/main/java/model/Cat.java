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
public class Cat extends Mammal {
    public Cat() {
        super(new SingService(SoundEnums.CAT));
    }

    public Cat(SingService singService) {
        super(singService);
    }
}
