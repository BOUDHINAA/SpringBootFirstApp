package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Entities.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    List<Chambre> findByNumChambre(long numChambre);
    List<Chambre> findByTypeC(TypeChambre typeC);
    List<Chambre> findByBloc(Bloc bloc);
    List<Chambre> findByBlocAndTypeC(Bloc bloc, TypeChambre typeC);
    List<Chambre> findByNumChambreAndTypeC(long numChambre, TypeChambre typeC);
    List<Chambre> findByFoyerUniversiteAndReservationsYearAndReservationsEtudiantNomAndNumChambre(String universite, int year, String etudiantNom, long numChambre);

}
