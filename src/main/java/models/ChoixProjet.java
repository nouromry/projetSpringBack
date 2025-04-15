package models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "choixProjet")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ChoixProjetId.class)
public class ChoixProjet {
    @Id
    @ManyToOne
    @JoinColumn(name = "idBinome")
    private Binome binome;

    @Id
    @ManyToOne
    @JoinColumn(name = "idProjet")
    private Projet projet;

    @Column(name = "priorite", nullable = false)
    private Integer priorite;
}
