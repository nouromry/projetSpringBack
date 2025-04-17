package models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "etudiant")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Utilisateur utilisateur;

    @Column(name = "moyenneGeneral", precision = 5, scale = 2)
    private Double moyenneGeneral;

    @Column(name = "matricule", nullable = false, unique = true)
    private String matricule;

    @Column(name = "filiere", nullable = false)
    private String filiere;
    @Column(name = "groupe", nullable = false)
    private String groupe;
}
