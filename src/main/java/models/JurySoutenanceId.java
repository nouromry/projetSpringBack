package models;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JurySoutenanceId implements Serializable {
    private Integer enseignant;
    private Integer soutenance;
}
