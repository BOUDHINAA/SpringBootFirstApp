package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.DAO.Entities.Reservation;

import java.util.Date;
import java.util.List;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {




}
