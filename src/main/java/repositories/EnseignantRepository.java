package repositories;

import models.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnseignantRepository extends JpaRepository<Enseignant, Integer> {
    List<Enseignant> findAll();
}
