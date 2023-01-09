package tn.esprit.cs.firstproject.kaddem.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.cs.firstproject.kaddem.entities.Equipe;

import java.util.List;

public interface EquipeRepository extends CrudRepository<Equipe,Integer> {

    List<Equipe> findByDetailEquipeThematiqueContains(String thematique);
}
