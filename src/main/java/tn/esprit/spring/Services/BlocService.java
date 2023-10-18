package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Bloc;
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
}
