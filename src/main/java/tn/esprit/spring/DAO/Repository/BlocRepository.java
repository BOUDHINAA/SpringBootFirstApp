package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {

    List<Bloc> findByNomBloc(String nomBloc);


    List<Bloc> findByCapaciteBloc(long capaciteBloc);


    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, long capaciteBloc);


    List<Bloc> findByNomBlocIgnoreCase(String nomBloc);


    List<Bloc> findByCapaciteBlocGreaterThan(long capacite);


    List<Bloc> findByNomBlocContaining(String subString);


    List<Bloc> findAllOrderByNomBloc();


    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, long capaciteBloc);


    List<Bloc> findByFoyer(Foyer foyer);


    List<Bloc> findByFoyerUniversite(String universite);





}
