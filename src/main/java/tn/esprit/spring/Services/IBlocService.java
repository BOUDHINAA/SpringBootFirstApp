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

    Bloc findByNomBloc(String nomBloc);

    Bloc getByNomBloc(String nomBloc);

    List<Bloc> findBlocByNomAndCapacite(String nomBloc, int capacite);

    List<Bloc> findByCapaciteBloc(int capacite);

    List<Bloc> findByNomBlocIgnoreCase(String nomBloc);


    List<Bloc> findByCapaciteBlocGreaterThan(int capacite);


    List<Bloc> findByNomBlocContaining(String subString);

    List<Bloc> findAllByOrderByNomBlocAsc();


    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, int capacite);


    List<Bloc> findByFoyer(Foyer foyer);

    List<Bloc> findByFoyerUniversite(String nomUniversite);
}
