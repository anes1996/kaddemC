package tn.esprit.cs.firstproject.kaddem.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.cs.firstproject.kaddem.entities.Contrat;
//JPA Repository
public interface ContratRepository extends CrudRepository<Contrat,Integer> {
}
