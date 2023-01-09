package tn.esprit.cs.firstproject.kaddem.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.cs.firstproject.kaddem.entities.DetailEquipe;

import java.util.List;

public interface DetailEquipeRepository extends CrudRepository<DetailEquipe,Integer> {

    List<DetailEquipe> findByThematiqueLike(String thematique);
    List<DetailEquipe> findByThematiqueContains(String technologie);
    List<DetailEquipe> findByThematiqueContaining(String technologie);
}

