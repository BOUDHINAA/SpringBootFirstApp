package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Reservation;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {

    List<Reservation> findByValidatedTrue();


    List<Reservation> findByEtudiantId(Long etudiantId);


    List<Reservation> findByYearAndValidated(int year, boolean validated);


}
