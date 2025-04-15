package controllers;

import models.Enseignant;
import services.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enseignants")
public class EnseignantController {

    @Autowired
    private EnseignantService enseignantService;

    // Get all Enseignants
    @GetMapping("/")
    public List<Enseignant> getAllEnseignants() {
        return enseignantService.getAllEnseignants();
    }
}
