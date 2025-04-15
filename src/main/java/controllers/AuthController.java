package controllers;

import models.Utilisateur;
import services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UtilisateurService utilisateurService;

    // Signup
    @PostMapping("/signup")
    public ResponseEntity<Utilisateur> signup(@RequestParam String email,
                                              @RequestParam String password,
                                              @RequestParam String nom,
                                              @RequestParam String prenom
                                               ) {
        Utilisateur utilisateur = utilisateurService.signup(email, password, nom, prenom);
        return ResponseEntity.ok(utilisateur);
    }

    // Login
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        if (utilisateurService.login(email, password).isPresent()) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
