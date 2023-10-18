package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Chambre;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.DAO.Repository.ChambreRepository;
@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;


    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre editChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> addChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public List<Chambre> findAll() {
        return chambreRepository.findAll();
    }

    @Override
    public Optional<Chambre> findById(Long id) {
        return chambreRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public void delete(Chambre b) {
        chambreRepository.delete(b);
    }
}
