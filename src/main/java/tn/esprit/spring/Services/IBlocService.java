package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;

import java.util.List;

public interface IBlocService {

    Bloc addBloc(Bloc b);
    Bloc editBloc(Bloc b);

    List<Bloc> addBlocs(List<Bloc> blocs);
    List<Bloc> findAll();

    Bloc findById(Long id);

    void deleteById(Long id);

    void delete(Bloc b);

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
