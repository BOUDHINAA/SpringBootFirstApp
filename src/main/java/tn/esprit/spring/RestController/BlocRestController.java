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
    ResponseEntity<Bloc> getBlocById(@PathVariable Long id) {
        Bloc bloc = iBlocService.findById(id);

        if (bloc != null) {
            return ResponseEntity.ok(bloc);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/editBloc/{id}")
    ResponseEntity<Bloc> editBloc(@PathVariable("id") Long id, @RequestBody Bloc updatedBloc) {
        Optional<Bloc> existingBlocOptional = Optional.ofNullable(iBlocService.findById(id));

        if (existingBlocOptional.isPresent()) {
            Bloc existingBloc = existingBlocOptional.get();
            existingBloc.setNomBloc(updatedBloc.getNomBloc());
            existingBloc.setCapacite(updatedBloc.getCapacite());
            Bloc savedBloc = iBlocService.editBloc(existingBloc);
            return ResponseEntity.ok(savedBloc);
        } else {
            return ResponseEntity.notFound().build();
        }
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
}