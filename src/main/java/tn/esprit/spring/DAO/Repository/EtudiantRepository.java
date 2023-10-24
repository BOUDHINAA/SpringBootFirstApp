package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Etudiant;

import java.util.Date;
import java.util.List;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    List<Etudiant> findByNomETAndPrenomEt(String nomET, String prenomEt);

    List<Etudiant> findByCin(long cin);

    List<Etudiant> findByDateNaissanceAfter(Date date);

    List<Etudiant> findByEcole(String ecole);

    List<Etudiant> findByReservationsId(long reservationId);

    List<Etudiant> findByReservationsAnnee(int annee);


}
