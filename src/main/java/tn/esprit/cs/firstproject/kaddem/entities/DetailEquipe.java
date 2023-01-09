package tn.esprit.cs.firstproject.kaddem.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
     Integer idDetailEquipe; // Clé primaire
     Integer salle;
     String thematique;
    @OneToOne(mappedBy="detailEquipe")
    private Equipe equipe;

}
