package tn.esprit.cs.firstproject.kaddem.Services.SCE;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.cs.firstproject.kaddem.Services.IFC.IFC_Equipe;
import tn.esprit.cs.firstproject.kaddem.entities.Equipe;
import tn.esprit.cs.firstproject.kaddem.entities.Etudiant;
import tn.esprit.cs.firstproject.kaddem.repositories.EquipeRepository;
import tn.esprit.cs.firstproject.kaddem.repositories.EtudiantRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class Sce_Equipe implements IFC_Equipe {
    EquipeRepository EquipeRepo;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return (List<Equipe>)EquipeRepo.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe E) {
        EquipeRepo.save(E);
        return E;
    }

    @Override
    public Equipe updateEquipe(Equipe E) {
        EquipeRepo.save(E);
        return E;
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return EquipeRepo.findById(idEquipe).orElse(null);
    }

    @Override
    public void removeEquipe(Integer idEquipe) {
        EquipeRepo.deleteById(idEquipe);
    }
}
