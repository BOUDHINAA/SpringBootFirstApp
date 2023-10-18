package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Foyer;

import java.util.List;
import java.util.Optional;

public interface IFoyerService {

    Foyer addFoyer(Foyer foyer);
    Foyer editFoyer(Foyer f);

    List<Foyer> addFoyers(List<Foyer> foyers);
    List<Foyer> findAll();

    Optional<Foyer> findById(Long id);

    void deleteById(Long id);

    void delete(Foyer f);

}
