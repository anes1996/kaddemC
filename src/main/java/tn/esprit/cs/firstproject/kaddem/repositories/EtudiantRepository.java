package tn.esprit.cs.firstproject.kaddem.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.cs.firstproject.kaddem.entities.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant,Integer> {
}
