package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Universite;

import java.util.List;
import java.util.Optional;

public interface IUniversiteService {
    Universite addUniversite(Universite u);
    Universite editUniversite(Universite u);

    List<Universite> addUniversites(List<Universite> universites);
    List<Universite> findAll();

    Optional<Universite> findById(Long id);

    void deleteById(Long id);

    void delete(Universite u);

}
