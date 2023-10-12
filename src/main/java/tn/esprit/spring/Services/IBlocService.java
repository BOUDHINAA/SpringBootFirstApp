package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Bloc;

import java.util.List;

public interface IBlocService {

    Bloc addBloc(Bloc b);
    Bloc editBloc(Bloc b);

    List<Bloc> addBlocs(List<Bloc> blocs);
    List<Bloc> findAll();

    Bloc findById(Long id);

    void deleteById(Long id);

    void delete(Bloc b);

}
