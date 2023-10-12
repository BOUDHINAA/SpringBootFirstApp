package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}
