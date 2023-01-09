package tn.esprit.cs.firstproject.kaddem.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table( name = "Contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
     Integer idContrat; // Clé primaire
     Date dateDebutContrat;
     Date dateFinContrat;
    @Enumerated(EnumType.STRING)
     Specialite specialite;
     Boolean archive;
     Integer montantContrat;
    @ManyToOne
    Etudiant etudiant;


}
