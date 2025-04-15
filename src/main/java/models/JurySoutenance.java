package models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "jury_soutenance")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(JurySoutenanceId.class)
public class JurySoutenance {
    @Id
    @ManyToOne
    @JoinColumn(name = "enseignant_id")
    private Enseignant enseignant;

    @Id
    @ManyToOne
    @JoinColumn(name = "soutenance_id")
    private Soutenance soutenance;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleJury role;

    public enum RoleJury {
        président, examinateur, rapporteur
    }
}
