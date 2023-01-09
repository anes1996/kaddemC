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
@Table( name = "Departement")
public class Departement implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
     Integer idDepart; // Clé primaire
     String nomDepart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="departement")
    private Set<Etudiant> Etudiants;



}
