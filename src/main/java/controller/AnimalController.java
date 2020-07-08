/**
 * 
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Animal;
import service.AnimalCountService;

/**
 * @author arvind
 *
 */

@Controller
public class AnimalController {
    @RequestMapping(method = RequestMethod.GET, value = "/flyanimal/getCount")
    @ResponseBody
    public int getFlyingAnimalCount(@RequestBody Animal[] animals) {
        AnimalCountService animalService = new AnimalCountService(animals);
        int flyingAnimal = animalService.getf_animal();
        return flyingAnimal;
    }

}
