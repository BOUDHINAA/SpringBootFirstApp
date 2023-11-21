package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Reservation;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {

    Set<Reservation> findByEstValideTrue();
   // Set<Reservation> findByAnneeUniversitaireAndEstValide(LocalDate anneeUniversitaire);




    /*
    List<Reservation> findByEstValide(Boolean estValide);
    List<Reservation> findByEtudiants_IdEtudiant(Long etudiantId);
    List<Reservation> findByAnneeUniversitaireAndEstValide(Date anneeUniversitaire, Boolean estValide);



1- Recherche des réservations validées
2- Recherche des réservations par l'id de l'étudiant
3- Recherche des réservations par année et validité

    List<Reservation> findByEstValide(boolean estValide);
    List<Reservation> findByEtudiantId(long idEtudiant);
    List<Reservation> findByAnneeUniversitaireAndAndEstValide(Date year,boolean estValide);
*/
}
