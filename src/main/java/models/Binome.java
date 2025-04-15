package models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "binome")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Binome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "etud1", nullable = false)
    private Etudiant etud1;

    @ManyToOne
    @JoinColumn(name = "etud2", nullable = false)
    private Etudiant etud2;

    @Column(name = "moyenneBinome", precision = 5, scale = 2)
    private Double moyenneBinome;
}
