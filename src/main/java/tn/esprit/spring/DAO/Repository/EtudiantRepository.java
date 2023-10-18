package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}
