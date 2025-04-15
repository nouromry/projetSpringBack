package models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "chefDep")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChefDep {
    @Id
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Utilisateur utilisateur;

    @Column(name = "departement", nullable = false)
    private String departement;
}
