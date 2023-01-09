package tn.esprit.cs.firstproject.kaddem.Services.IFC;

import tn.esprit.cs.firstproject.kaddem.entities.Universite;

import java.util.List;

public interface IFC_UniversiteService {

    List<Universite> retrieveAllUniversites();

    Universite addUniversite (Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (Integer idUniversite);


    void removeUniversite (Integer idUniversite);
}
