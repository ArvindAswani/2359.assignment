/**
 * 
 */
package service;

import adapterServices.Fly;
import adapterServices.SoundBehavior;
import adapterServices.SwimmBehavior;
import adapterServices.Walkable;
import model.Animal;

/**
 * @author arvind
 *
 */
public class AnimalCountService {
	Animal[] animals;
    int f_animal = 0;
    int w_animal = 0;
    int speak_animal = 0;
    int swim_animal = 0;


    public AnimalCountService(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Fly) {
                f_animal += 1;
            }
            if (animals[i] instanceof Walkable) {
                w_animal += 1;
            }
            if (animals[i] instanceof SoundBehavior) {
                speak_animal += 1;
            }
            if (animals[i] instanceof SwimmBehavior) {
                swim_animal += 1;
            }
        }
    }

    public int getf_animal() {
        return f_animal;
    }

    public void setf_animal(int f_animal) {
        this.f_animal = f_animal;
    }

    public int getw_animal() {
        return w_animal;
    }

    public void setw_animal(int w_animal) {
        this.w_animal = w_animal;
    }

    public int getspeak_animal() {
        return speak_animal;
    }

    public void setspeak_animal(int speak_animal) {
        this.speak_animal = speak_animal;
    }

    public int getswim_animal() {
        return swim_animal;
    }

    public void setswim_animal(int swim_animal) {
        this.swim_animal = swim_animal;
    }
}
