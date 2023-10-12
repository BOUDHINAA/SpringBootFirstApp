package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
