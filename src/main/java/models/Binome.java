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
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "etud1", referencedColumnName = "id", nullable = false)
    private Etudiant etud1;

    @ManyToOne(optional = false)
    @JoinColumn(name = "etud2", referencedColumnName = "id", nullable = false)
    private Etudiant etud2;

    @Column(name = "moyenneBinome", precision = 5, scale = 2)
    private Double moyenneBinome;
}
