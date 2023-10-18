package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
