package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.DAO.Repository.EtudiantRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant editEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Optional<Etudiant> findById(Long id) {
        return etudiantRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public void delete(Etudiant e) {
        etudiantRepository.delete(e);
    }

    @Override
    public List<Etudiant> findByNomETAndPrenomEt(String nomET, String prenomEt) {
        return etudiantRepository.findByNomETAndPrenomEt(nomET, prenomEt);
    }

    @Override
    public List<Etudiant> findByCin(long cin) {
        return etudiantRepository.findByCin(cin);
    }

    @Override
    public List<Etudiant> findByDateNaissanceAfter(Date date) {
        return etudiantRepository.findByDateNaissanceAfter(date);
    }

    @Override
    public List<Etudiant> findByEcole(String ecole) {
        return etudiantRepository.findByEcole(ecole);
    }

    @Override
    public List<Etudiant> findByReservationsId(long reservationId) {
        return etudiantRepository.findByReservationsId(reservationId);
    }

    @Override
    public List<Etudiant> findByReservationsAnnee(int annee) {
        return etudiantRepository.findByReservationsAnnee(annee);
    }
}
