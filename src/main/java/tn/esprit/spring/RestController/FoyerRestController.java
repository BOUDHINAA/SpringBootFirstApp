package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.Services.IFoyerService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/foyers")
public class FoyerRestController {

    @Autowired
    private IFoyerService foyerService;

    @PostMapping("/add")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @PutMapping("/edit/{id}")
    public Foyer editFoyer(@PathVariable Long id, @RequestBody Foyer updatedFoyer) {
        return foyerService.editFoyer(updatedFoyer);
    }

    @GetMapping("/all")
    public List<Foyer> findAllFoyers() {
        return foyerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Foyer> findFoyerById(@PathVariable Long id) {
        Optional<Foyer> optionalFoyer = foyerService.findById(id);

        return optionalFoyer
                .map(foyer -> ResponseEntity.ok().body(foyer))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFoyer(@PathVariable Long id) {
        foyerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
