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
    public List<Bloc> findByNomBloc(String nomBloc) {
        return blocRepository.findByNomBloc((nomBloc));
    }

    @Override
    public List<Bloc> findByCapacite(long capacite) {
        return blocRepository.findByCapacite(capacite);
    }

    @Override
    public List<Bloc> findByCapaciteAndNomBloc(long capacite, String nomBloc) {
        return blocRepository.findByCapaciteAndNomBloc(capacite,nomBloc);
    }

    @Override
    public List<Bloc> findByNomBlocIgnoreCase(String nomBloc) {
        return blocRepository.findByNomBlocIgnoreCase(nomBloc);
    }

    @Override
    public List<Bloc> findByCapaciteGreaterThan(long capacite) {
        return blocRepository.findByCapaciteGreaterThan(capacite);
    }

    @Override
    public List<Bloc> findByNomBlocContaining(String subString) {
        return blocRepository.findByNomBlocContaining(subString);
    }

    @Override
    public List<Bloc> findByNomBlocOrderByNomBlocAsc(String nomBloc) {
        return blocRepository.findByNomBlocOrderByNomBlocAsc(nomBloc);
    }

    @Override
    public List<Bloc> findByNomBlocOrCapacite(String nomBloc, long capacite) {
        return blocRepository.findByNomBlocOrCapacite(nomBloc, capacite);
    }

    @Override
    public Bloc findBlocByFoyer(Foyer foyer) {
        return blocRepository.findBlocByFoyer(foyer);
    }


}
