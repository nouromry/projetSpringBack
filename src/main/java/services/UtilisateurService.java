package services;

import models.Utilisateur;
import repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // Signup service: Registers a new user
    public Utilisateur signup(String email, String password, String nom, String prenom) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setEmail(email);
        utilisateur.setPassword(passwordEncoder.encode(password)); // Password encryption
        utilisateur.setNom(nom);
        utilisateur.setPrenom(prenom);
        return utilisateurRepository.save(utilisateur);
    }

    // Login service: Verifies user credentials
    public Optional<Utilisateur> login(String email, String password) {
        Optional<Utilisateur> utilisateur = utilisateurRepository.findByEmail(email);
        if (utilisateur.isPresent() && passwordEncoder.matches(password, utilisateur.get().getPassword())) {
            return utilisateur;
        }
        return Optional.empty();
    }
}
