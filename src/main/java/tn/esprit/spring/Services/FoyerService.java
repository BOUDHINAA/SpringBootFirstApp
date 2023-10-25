package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Repository.FoyerRepository;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer editFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> addFoyers(List<Foyer> foyers) {
        return foyerRepository.saveAll(foyers);
    }

    @Override
    public List<Foyer> findAll() {
        return foyerRepository.findAll();
    }

    @Override
    public Optional<Foyer> findById(Long id) {
        return foyerRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        foyerRepository.deleteById(id);

    }

    @Override
    public void delete(Foyer f) {
        foyerRepository.delete(f);

    }

    @Override
    public List<Foyer> findByBloc(Bloc bloc) {
        return foyerRepository.findByBloc(bloc);
    }

    @Override
    public Foyer findByIdAndBloc(Long idFoyer, Bloc bloc) {
        return foyerRepository.findByIdAndBloc(idFoyer,bloc);
    }

    @Override
    public List<Foyer> findByCapacite(int capacite) {
        return foyerRepository.findByCapacite(capacite);
    }

    @Override
    public Foyer findByBlocAndUniversite(Bloc bloc, String universite) {
        return foyerRepository.findByBlocAndUniversite(bloc, universite);
    }
}
