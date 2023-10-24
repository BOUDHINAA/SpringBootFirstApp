package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.Services.IBlocService;

import java.util.List;
import java.util.Optional;


@RestController
@AllArgsConstructor
public class BlocRestController {
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
    
    @GetMapping("/findbynom/{nomBloc}")
    Bloc getBlocByNom(@PathVariable String nomBloc) {
        Bloc bloc = iBlocService.getByNomBloc(nomBloc);

        if (bloc != null) {
            return bloc;
        } else {
            return new Bloc();

        }
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}