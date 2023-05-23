package br.univille.dentista.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.dentista.entity.Dentista;
import br.univille.dentista.repository.DentistaRepository;
import br.univille.dentista.service.DentistaService;

@Service
public class DentistaServiceImpl implements DentistaService {

    @Autowired
    public DentistaRepository repository;

    @Override
    public List<Dentista> getAll() {
        return repository.getAll();
    }

    @Override
    public void save(Dentista dentista) {
        repository.save(dentista);
    }

    
    public Dentista findById(long id){
        Optional<Dentista> resultado = repository.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return null;
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
    
}
