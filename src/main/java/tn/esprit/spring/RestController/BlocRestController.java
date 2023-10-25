package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.Services.IBlocService;

import java.util.List;



@RestController
@AllArgsConstructor
public class BlocRestController {
    @Autowired
    IBlocService iBlocService;

    @GetMapping("findAllBlocs")
    List<Bloc> findAll() {
        return iBlocService.findAll();
    }

    @PostMapping("addBloc")
    Bloc addBloc(@RequestBody Bloc b) {
        return iBlocService.addBloc(b);
    }
    @GetMapping("/findBlocById/{id}")
    Bloc getBlocById(@PathVariable Long id) {
        Bloc bloc = iBlocService.findById(id);

        if (bloc != null) {
            return bloc;
        } else {
            Bloc defaultBloc = new Bloc();
            defaultBloc.setNomBloc("Introuvable");
            defaultBloc.setCapacite(0);
            return defaultBloc;
        }
    }
    @PutMapping("/editBloc/{id}")

    Bloc editBloc(@PathVariable("id") Long id, @RequestBody Bloc updatedBloc) {
        Bloc existingBloc = iBlocService.findById(id);

        if (existingBloc != null) {
            existingBloc.setNomBloc(updatedBloc.getNomBloc());
            existingBloc.setCapacite(updatedBloc.getCapacite());
            return iBlocService.editBloc(existingBloc);
        }

        Bloc defaultBloc = new Bloc();
        defaultBloc.setNomBloc("Introuvable");
        defaultBloc.setCapacite(0);

        return defaultBloc;
    }

    @DeleteMapping("/deleteBloc/{id}")
    ResponseEntity<Void> deleteBloc(@PathVariable Long id) {
        Bloc existingBloc = iBlocService.findById(id);

        if (existingBloc != null) {
            iBlocService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/findByNomBloc/{nomBloc}")
    public List<Bloc> findBlocByNom(@PathVariable String nomBloc) {
        return iBlocService.findByNomBloc(nomBloc);
    }

    @GetMapping("/findByCapaciteBloc/{capaciteBloc}")
    public List<Bloc> findBlocsByCapacite(@PathVariable long capaciteBloc) {
        return iBlocService.findByCapaciteBloc(capaciteBloc);
    }

    @GetMapping("/findByNomBlocAndCapaciteBloc")
    public List<Bloc> findBlocsByNomAndCapacite(@RequestParam String nomBloc, @RequestParam long capaciteBloc) {
        return iBlocService.findByNomBlocAndCapaciteBloc(nomBloc, capaciteBloc);
    }

    @GetMapping("/findByNomBlocIgnoreCase/{nomBloc}")
    public List<Bloc> findBlocByNomIgnoreCase(@PathVariable String nomBloc) {
        return iBlocService.findByNomBlocIgnoreCase(nomBloc);
    }

    @GetMapping("/findByCapaciteBlocGreaterThan/{capacite}")
    public List<Bloc> findBlocsByCapaciteGreaterThan(@PathVariable long capacite) {
        return iBlocService.findByCapaciteBlocGreaterThan(capacite);
    }

    @GetMapping("/findByNomBlocContaining/{subString}")
    public List<Bloc> findBlocByNomContaining(@PathVariable String subString) {
        return iBlocService.findByNomBlocContaining(subString);
    }

    @GetMapping("/sortByNomBloc")
    public List<Bloc> sortByNomBloc() {
        return iBlocService.findAllOrderByNomBloc();
    }

    @GetMapping("/findByNomBlocOrCapaciteBloc")
    public List<Bloc> findBlocByNomOrCapacite(@RequestParam String nomBloc, @RequestParam long capaciteBloc) {
        return iBlocService.findByNomBlocOrCapaciteBloc(nomBloc, capaciteBloc);
    }

    @GetMapping("/findByFoyer/{foyerId}")
    public List<Bloc> findBlocsByFoyer(@PathVariable Long foyerId) {
        Foyer foyer = new Foyer();
        foyer.setIdFoyer(foyerId);
        return iBlocService.findByFoyer(foyer);
    }

    @GetMapping("/findByFoyerUniversite/{universite}")
    public List<Bloc> findBlocByFoyerUniversite(@PathVariable String universite) {
        return iBlocService.findByFoyerUniversite(universite);
    }








}