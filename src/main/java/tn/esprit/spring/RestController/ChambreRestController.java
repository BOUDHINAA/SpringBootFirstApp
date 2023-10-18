package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.Services.IChambreService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/chambres")
public class ChambreRestController {


    @Autowired
    private IChambreService chambreService;

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @PutMapping("/edit/{id}")
    public Chambre editChambre(@PathVariable Long id, @RequestBody Chambre updatedChambre) {
        return chambreService.editChambre(updatedChambre);
    }

    @GetMapping("/all")
    public List<Chambre> findAllChambres() {
        return chambreService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chambre> findChambreById(@PathVariable Long id) {
        Optional<Chambre> optionalChambre = chambreService.findById(id);

        return optionalChambre
                .map(chambre -> ResponseEntity.ok().body(chambre))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable Long id) {
        chambreService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}

