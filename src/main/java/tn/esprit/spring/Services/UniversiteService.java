package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Universite;
import tn.esprit.spring.DAO.Repository.UniversiteRepository;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite editUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public List<Universite> addUniversites(List<Universite> universites) {
        return universiteRepository.saveAll(universites);
    }

    @Override
    public List<Universite> findAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Optional<Universite> findById(Long id) {
        return universiteRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        universiteRepository.deleteById(id);

    }

    @Override
    public void delete(Universite u) {
        universiteRepository.delete(u);

    }
}
