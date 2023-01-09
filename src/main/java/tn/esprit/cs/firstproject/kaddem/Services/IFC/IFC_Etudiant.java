package tn.esprit.cs.firstproject.kaddem.Services.IFC;
import tn.esprit.cs.firstproject.kaddem.entities.Etudiant;

import java.util.List;

public interface IFC_Etudiant {

    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant E);

    Etudiant updateEtudiant (Etudiant E);

    Etudiant retrieveEtudiant (Integer idEtudiant);

    void removeEtudiant (Integer idEtudiant);
}
