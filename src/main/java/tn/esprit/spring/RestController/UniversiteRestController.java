package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.DAO.Entities.Universite;
import tn.esprit.spring.Services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteRestController {
    IUniversiteService iUniversiteService;

    @GetMapping("findAllUniversites")
    List<Universite> findAll(){
        return iUniversiteService.findAll();
    }

    @PostMapping("/addUniversite")
    Universite addUniversite (@RequestBody Universite b){
        return iUniversiteService.addUniversite(b);
    }
}
