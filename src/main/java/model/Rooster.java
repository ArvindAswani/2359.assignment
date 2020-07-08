/**
 * 
 */
package model;

import service.LanguageService;
import service.SingService;
import utils.LanguageEnums;
import utils.SoundEnums;

/**
 * @author arvind
 *
 */
public class Rooster  extends Chicken{
	
	LanguageService languageService;
    SingService singService;
    LanguageEnums languageEnums;

    public Rooster() {
        this.singService = new SingService(SoundEnums.ROOSTER);
    }

    public Rooster(LanguageEnums languageEnums) {
        this.singService = new SingService(SoundEnums.ROOSTER);
        this.languageEnums = languageEnums;
    }

    @Override
    public void canFly() {
        super.canFly();
    }

    @Override
    public void callSound() {
        String translate = LanguageService.translate(SoundEnums.ROOSTER.getSound(), languageEnums);
        System.out.println(translate);

    }

}
