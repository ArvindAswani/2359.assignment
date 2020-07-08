/**
 * 
 */
package utils;

/**
 * @author arvind
 *
 */
public enum SoundEnums {
	
        ROOSTER("Cock-a-doodle-doo"),
	    CHICKEN("Cluck, cluck"),
	    DUCK("Quack, quack"),
	    DEFAULT("I am singing"),
	    NO_SOUND("");
	    private String sound;

	    SoundEnums(String sound) {
	        this.sound = sound;
	    }

	    public String getSound() {
	        return sound;
	    }
}
