package guru.springframework.sfgdi.controllers;

import com.springframework.pets.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }
}
