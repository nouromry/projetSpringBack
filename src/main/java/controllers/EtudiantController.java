package controllers;

import models.Etudiant;
import services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    // Get all Etudiants
    @GetMapping("/")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }
}
