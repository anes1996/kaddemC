package tn.esprit.cs.firstproject.kaddem.Services.IFC;

import tn.esprit.cs.firstproject.kaddem.entities.Equipe;
import tn.esprit.cs.firstproject.kaddem.entities.Etudiant;

import java.util.List;

public interface IFC_Equipe {

    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe (Equipe E);

    Equipe updateEquipe (Equipe E);

    Equipe retrieveEquipe (Integer idEquipe);

    void removeEquipe (Integer idEquipe);
}
