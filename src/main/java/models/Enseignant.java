package models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "enseignant")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enseignant {
    @Id
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Utilisateur utilisateur;

    @Column(name = "specialite")
    private String specialite;
}
