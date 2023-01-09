package tn.esprit.cs.firstproject.kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.cs.firstproject.kaddem.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}
