/**
 * 
 */
package service;

import utils.SoundEnums;

/**
 * @author arvind
 *
 */
public class SingService {

	private SoundEnums soundEnums;

    public  SingService(SoundEnums soundEnums) {
        this.soundEnums = soundEnums;
    }

    public void makeSound() {
        System.out.println(soundEnums.getSound());
    }
}
