package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.Services.IEtudiantService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantRestController {

    @Autowired
    IEtudiantService etudiantService;

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @PutMapping("/edit/{id}")
    public Etudiant editEtudiant(@PathVariable Long id, @RequestBody Etudiant updatedEtudiant) {
        return etudiantService.editEtudiant(updatedEtudiant);
    }

    @GetMapping("/all")
    public List<Etudiant> findAllEtudiants() {
        return etudiantService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Etudiant> findEtudiantById(@PathVariable Long id) {
        Optional<Etudiant> optionalEtudiant = etudiantService.findById(id);

        return optionalEtudiant
                .map(etudiant -> ResponseEntity.ok().body(etudiant))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEtudiant(@PathVariable Long id) {
        etudiantService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}