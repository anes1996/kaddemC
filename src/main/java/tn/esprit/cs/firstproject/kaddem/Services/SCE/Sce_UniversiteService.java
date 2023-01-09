package tn.esprit.cs.firstproject.kaddem.Services.SCE;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.cs.firstproject.kaddem.Services.IFC.IFC_UniversiteService;
import tn.esprit.cs.firstproject.kaddem.entities.Universite;
import tn.esprit.cs.firstproject.kaddem.repositories.UniversiteRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class Sce_UniversiteService implements IFC_UniversiteService {
   UniversiteRepository UnvRepo;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return UnvRepo.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        UnvRepo.save(u);
        return u;
    }

    @Override
    public Universite updateUniversite(Universite u) {
        UnvRepo.save(u);
        return u;
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return UnvRepo.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Integer idUniversite) {
        UnvRepo.deleteById(idUniversite);
    }
}
