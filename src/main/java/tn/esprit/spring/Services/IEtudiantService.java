package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Etudiant;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IEtudiantService {

    Etudiant addEtudiant(Etudiant e);
    Etudiant editEtudiant(Etudiant e);

    List<Etudiant> addEtudiants(List<Etudiant> etudiants);
    List<Etudiant> findAll();

    Optional<Etudiant> findById(Long id);

    void deleteById(Long id);

    void delete(Etudiant e);

    List<Etudiant> findByNomETAndPrenomEt(String nomET, String prenomEt);

    List<Etudiant> findByCin(long cin);

    List<Etudiant> findByDateNaissanceAfter(Date date);

    List<Etudiant> findByEcole(String ecole);

    List<Etudiant> findByReservationsId(long reservationId);

    List<Etudiant> findByReservationsAnnee(int annee);

}
