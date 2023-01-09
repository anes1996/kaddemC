package tn.esprit.cs.firstproject.kaddem.Services.SCE;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.cs.firstproject.kaddem.Services.IFC.IFC_Etudiant;
import tn.esprit.cs.firstproject.kaddem.entities.Etudiant;
import tn.esprit.cs.firstproject.kaddem.repositories.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class Sce_Etudiant implements IFC_Etudiant {
    EtudiantRepository EtudRepo;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>)EtudRepo.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant E) {
        EtudRepo.save(E);
        return E;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant E) {
        EtudRepo.save(E);
        return E;
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return EtudRepo.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        EtudRepo.deleteById(idEtudiant);
    }
}
