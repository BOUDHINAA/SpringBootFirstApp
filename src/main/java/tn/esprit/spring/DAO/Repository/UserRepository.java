package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
