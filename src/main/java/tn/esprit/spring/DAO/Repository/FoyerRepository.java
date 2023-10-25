package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;

import java.util.List;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {

    List<Foyer> findByBloc(Bloc bloc);


    Foyer findByIdAndBloc(Long idFoyer, Bloc bloc);


    List<Foyer> findByCapacite(int capacite);


    Foyer findByBlocAndUniversite(Bloc bloc, String universite);
}

