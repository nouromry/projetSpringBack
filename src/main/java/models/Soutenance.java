package models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "soutenance")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Soutenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "duree")
    private Integer duree;

    @Column(name = "heureD", nullable = false)
    private LocalTime heureD;

    @Column(name = "heureF", nullable = false)
    private LocalTime heureF;

    @ManyToOne
    @JoinColumn(name = "binome_id", nullable = false)
    private Binome binome;
}
