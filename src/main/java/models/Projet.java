package models;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "projet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "description")
    private String description;

    @Column(name = "technologies")
    private String technologies;

    @Column(name = "etat", nullable = false)
    @Enumerated(EnumType.STRING)
    private Etat etat;

    @Column(name = "dateDepot")
    private java.sql.Date dateDepot;

    @Column(name = "dateAffectation")
    private java.sql.Date dateAffectation;

    @ManyToOne
    @JoinColumn(name = "enseignant_id", nullable = false)
    private Enseignant enseignant;

    public enum Etat {
        en_cours("en cours"),
        termine("terminé"),
        en_attente("en attente");

        private final String label;
        Etat(String label) { this.label = label; }
        public String getLabel() { return label; }
    }
}

