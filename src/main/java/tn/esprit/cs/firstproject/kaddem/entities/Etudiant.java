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
@Table( name = "Etudiant")
public class Etudiant implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
     Integer idEtudiant; // Clé primaire
     String prenomE;
     String nomE;
    @Enumerated(EnumType.STRING)
     Option op;
    @ManyToOne
    Departement departement;
    //n'est utilisé que si sur demande en examen
    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Contrat> Contrats;
    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;



}
