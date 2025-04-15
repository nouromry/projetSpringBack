package services;

import models.Enseignant;
import repositories.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnseignantService {

    @Autowired
    private EnseignantRepository enseignantRepository;

    // Fetch all Enseignants
    public List<Enseignant> getAllEnseignants() {
        return enseignantRepository.findAll();
    }
}
