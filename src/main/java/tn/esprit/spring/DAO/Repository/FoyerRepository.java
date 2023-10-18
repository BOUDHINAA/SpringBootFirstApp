package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Foyer;
@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
