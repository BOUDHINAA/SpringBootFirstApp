package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    Bloc findByNomBloc(String nomBloc);

    Bloc getByNomBloc(String nomBloc);

    List<Bloc> findByCapaciteBloc(int capacite);

    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, int capacite);

    List<Bloc> findByNomBlocIgnoreCase(String nomBloc);


    List<Bloc> findByCapaciteBlocGreaterThan(int capacite);


    List<Bloc> findByNomBlocContaining(String subString);

    List<Bloc> findAllByOrderByNomBlocAsc();


    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, int capacite);


    List<Bloc> findByFoyer(Foyer foyer);

    List<Bloc> findByFoyerUniversite(String nomUniversite);





}
