package tn.esprit.cs.firstproject.kaddem.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table( name = "Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
     Integer idEquipe; // Clé primaire
     String nomEquipe;
    @Enumerated(EnumType.STRING)
     Niveau niveau;
    @OneToOne
    private DetailEquipe detailEquipe;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
