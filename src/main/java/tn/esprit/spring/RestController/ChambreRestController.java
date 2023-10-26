package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Entities.TypeChambre;
import tn.esprit.spring.Services.IChambreService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/api/chambres")
public class ChambreRestController {


    @Autowired
    private IChambreService iChambreService;

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return iChambreService.addChambre(chambre);
    }

    @PutMapping("/edit/{id}")
    public Chambre editChambre(@PathVariable("id") long id, @RequestBody Chambre updatedChambre) {
        Chambre existingChambre=iChambreService.findById(id);
        if (existingChambre != null) {
            existingChambre.setNumChambre(updatedChambre.getNumChambre());
            existingChambre.setTypeC(updatedChambre.getTypeC());
            return iChambreService.editChambre(existingChambre);
        }
        Chambre defaultChambre = new Chambre();
        defaultChambre.setNumChambre(0);
        defaultChambre.setTypeC(TypeChambre.SIMPLE);

        return defaultChambre;
    }

    @PostMapping("/addchambres/{chambres}")
    public List<Chambre> addChambres(@PathVariable List<Chambre> chambres) {
        return iChambreService.addChambres(chambres);
    }

    @GetMapping("/all")
    public List<Chambre> findAllChambres() {
        return iChambreService.findAll();
    }

    @GetMapping("/{id}")
    public Chambre findById(@PathVariable("id") Long id) {
        Chambre chambre = iChambreService.findById(id);
        if (chambre != null) {
            return chambre;
        } else {
            Chambre defaultchambre = new Chambre();
            defaultchambre.setNumChambre(0);
            defaultchambre.setIdChambre(0);
            defaultchambre.setTypeC(TypeChambre.SIMPLE);
            return defaultchambre;
        }


    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable Long id) {
        iChambreService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/findByNumChambre/{numchambre}")
    public List<Chambre> findByNumChambre(@PathVariable long numchambre){
         return iChambreService.findByNumChambre(numchambre);
    }

    @GetMapping("/findByTypeC/{typec}")
    public List<Chambre> findByTypeC(@PathVariable TypeChambre typec){
        return iChambreService.findByTypeC(typec);
    }

    @GetMapping("/findByBloc/{bloc}")
    public List<Chambre> findByBloc(@PathVariable Bloc bloc){
        return iChambreService.findByBloc(bloc);
    }
    @GetMapping("/findByBlocAndTypeC/{bloc}/{typec}")
    public List<Chambre> findByBlocAndTypeC(@PathVariable Bloc bloc,@PathVariable TypeChambre typec ){
        return iChambreService.findByBlocAndTypeC(bloc,typec);
    }

    @GetMapping("/findByNumChambreAndType/{numc}/{typec}")
    public List<Chambre> findByNumChambreAndTypeC(@PathVariable long numc,@PathVariable TypeChambre typec){
        return iChambreService.findByNumChambreAndTypeC(numc,typec);
    }

}

