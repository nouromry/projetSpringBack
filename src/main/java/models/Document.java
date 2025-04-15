package models;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "document")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeDocument type;

    @Column(name = "dateDepot")
    private LocalDateTime dateDepot;

    @Column(name = "cheminFichier", nullable = false)
    private String cheminFichier;

    @ManyToOne
    @JoinColumn(name = "binome_id", nullable = false)
    private Binome binome;

    @ManyToOne
    @JoinColumn(name = "projet_id", nullable = false)
    private Projet projet;

    public enum TypeDocument {
        rapport_final, normal
    }
}
