package tn.esprit.cs.firstproject.kaddem.RestController;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.cs.firstproject.kaddem.Services.IFC.IFC_Etudiant;
import tn.esprit.cs.firstproject.kaddem.entities.Equipe;
import tn.esprit.cs.firstproject.kaddem.entities.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IFC_Etudiant etudiantservice;

    // http://localhost:8089/kaddem/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantservice.retrieveAllEtudiants();
        return listEtudiants;
    }
    // http://localhost:8089/kaddem/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Integer etudiantId) {
        return etudiantservice.retrieveEtudiant(etudiantId);
    }
    // http://localhost:8089/kaddem/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantservice.addEtudiant(e);
        return etudiant;
    }

    // http://localhost:8089/kaddem/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Integer etudiantId) {
        etudiantservice.removeEtudiant(etudiantId);
    }

    // http://localhost:8089/kaddem/etudiant/update-etudiant
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= etudiantservice.updateEtudiant(e);
        return etudiant;
    }

}
