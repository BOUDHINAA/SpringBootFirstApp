package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Repository.BlocRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class BlocService implements IBlocService{

    BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }
    @Override
    public List<Bloc> addBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }
    @Override
    public Bloc editBloc(Bloc b) {
        return blocRepository.save(b);
    }



    @Override
    public List<Bloc> findAll() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findById(Long id) {
        //return blocRepository.findById(id);
        //ou bien
        return blocRepository.findById(id).orElse(Bloc.builder().idBloc(0).nomBloc("No Bloc found").build());
    }

    @Override
    public void deleteById(Long id) {
        blocRepository.deleteById(id);

    }

    @Override
    public void delete(Bloc b) {
        blocRepository.delete(b);

    }

    @Override
    public Bloc findByNomBloc(String nomBloc) {
        return blocRepository.findByNomBloc(nomBloc);
    }

    @Override
    public Bloc getByNomBloc(String nomBloc) {
        return blocRepository.getByNomBloc(nomBloc);
    }

    @Override
    public List<Bloc> findBlocByNomAndCapacite(String nomBloc, int capacite) {

        return blocRepository.findByNomBlocAndCapaciteBloc(nomBloc, capacite);
    }

    @Override
    public List<Bloc> findByCapaciteBloc(int capacite) {
        return blocRepository.findByCapaciteBloc(capacite);
    }

    @Override
    public List<Bloc> findByNomBlocIgnoreCase(String nomBloc) {
        return blocRepository.findByNomBlocIgnoreCase(nomBloc);
    }

    @Override
    public List<Bloc> findByCapaciteBlocGreaterThan(int capacite) {
        return blocRepository.findByCapaciteBlocGreaterThan(capacite);
    }

    @Override
    public List<Bloc> findByNomBlocContaining(String subString) {
        return blocRepository.findByNomBlocContaining(subString);
    }

    @Override
    public List<Bloc> findAllByOrderByNomBlocAsc() {
        return blocRepository.findAllByOrderByNomBlocAsc();
    }

    @Override
    public List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, int capacite) {
        return blocRepository.findByNomBlocOrCapaciteBloc(nomBloc,
                capacite);
    }

    @Override
    public List<Bloc> findByFoyer(Foyer foyer) {
        return blocRepository.findByFoyer(foyer);
    }

    @Override
    public List<Bloc> findByFoyerUniversite(String nomUniversite) {
        return blocRepository.findByFoyerUniversite(nomUniversite);
    }


}
