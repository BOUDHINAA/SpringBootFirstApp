package tn.esprit.spring.Services;


import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Chambre;

import java.util.List;
import java.util.Optional;



public interface IChambreService {

    Chambre addChambre(Chambre c);
    Chambre editChambre(Chambre c);

    List<Chambre> addChambres(List<Chambre> chambres);
    List<Chambre> findAll();

    Optional<Chambre> findById(Long id);

    void deleteById(Long id);

    void delete(Chambre b);

}


