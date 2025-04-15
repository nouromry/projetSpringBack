package services;

import models.Etudiant;
import repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    // Fetch all Etudiants
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
}
