package models;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChoixProjetId implements Serializable {
    private Integer binome;
    private Integer projet;
}
