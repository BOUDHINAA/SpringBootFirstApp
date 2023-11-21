package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Reservation;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IReservationService {

    Reservation addReservation(Reservation r);
    Reservation editReservation(Reservation r);

    List<Reservation> addReservations(List<Reservation> reservations);
    List<Reservation> findAll();

    Optional<Reservation> findById(String id);

    void deleteById(String id);

    void delete(Reservation r);

    Set<Reservation> findByEstValide();
    Set<Reservation> findByEtudiants(long idEtudiant);
    Set<Reservation> findByAnneeUniversitaireAAndEstValide(LocalDate annee, Boolean estvalide);



}
