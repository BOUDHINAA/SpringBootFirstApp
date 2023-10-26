package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Bloc;

import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.Services.IBlocService;

import java.util.List;



@RestController
@AllArgsConstructor
@RequestMapping("/api/blocs")
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

    @PostMapping("/addBlocs")
    public List<Bloc> addBlocs(@RequestBody List<Bloc> blocs) {
        return iBlocService.addBlocs(blocs);
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
    void deleteBloc(@PathVariable Long id) {
        Bloc existingBloc = iBlocService.findById(id);

        if (existingBloc != null) {
            iBlocService.deleteById(id);
        }
    }

    @GetMapping("/findByNomBloc/{nomBloc}")
    public List<Bloc> findBlocByNom(@PathVariable String nomBloc) {
        return iBlocService.findByNomBloc(nomBloc);
    }

    @GetMapping("/findByCapaciteBloc/{capaciteBloc}")
    public List<Bloc> findBlocsByCapacite(@PathVariable long capaciteBloc) {
        return iBlocService.findByCapacite(capaciteBloc);
    }

    @GetMapping("/findByCapaciteAndNomBloc/{capaciteBloc}/{nomBloc}")
    public List<Bloc> findBlocsByCapaciteAndNomBloc(@PathVariable long capaciteBloc,@PathVariable String nomBloc) {
        return iBlocService.findByCapaciteAndNomBloc(capaciteBloc,nomBloc);
    }

    @GetMapping("/findByNomBlocIgnoreCase/{nomBloc}")
    public List<Bloc> findBlocsByNomBlocIgnoreCase(@PathVariable String nomBloc) {
        return iBlocService.findByNomBlocIgnoreCase(nomBloc);
    }

    @GetMapping("/findByCapaciteGreaterThan/{capacite}")
    public List<Bloc> findByCapaciteGreaterThan(@PathVariable long capacite) {
        return iBlocService.findByCapaciteGreaterThan(capacite);
    }

    @GetMapping("/findByNomBlocContaining/{subString}")
    public List<Bloc> findByNomBlocContaining(@PathVariable String subString) {
        return iBlocService.findByNomBlocContaining(subString);
    }

    @GetMapping("/findByNomBlocOrderByNomBlocAsc/{nomBloc}")
    public List<Bloc> findByNomBlocOrderByNomBlocAsc(@PathVariable String nomBloc) {
        return iBlocService.findByNomBlocOrderByNomBlocAsc(nomBloc);
    }

    @GetMapping("/findByNomBlocOrCapacite/{nomBloc}/{capacite}")
    public List<Bloc> findByNomBlocOrCapacite(@PathVariable String nomBloc,@PathVariable long capacite) {
        return iBlocService.findByNomBlocOrCapacite(nomBloc,capacite);
    }

    @GetMapping("/findBlocByFoyer/{foyer}")
    public Bloc findBlocByFoyer(@PathVariable Foyer foyer) {
        return iBlocService.findBlocByFoyer(foyer);
    }


}