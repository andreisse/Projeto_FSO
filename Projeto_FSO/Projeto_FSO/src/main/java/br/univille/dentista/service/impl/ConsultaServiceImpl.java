package br.univille.dentista.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import br.univille.dentista.entity.Consulta;
import br.univille.dentista.repository.ConsultaRepository;
import br.univille.dentista.service.ConsultaService;

@Service
public class ConsultaServiceImpl implements ConsultaService {
    
    @Autowired
    private ConsultaRepository repository;

    @Override
    public List<Consulta> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Consulta consulta) {
        repository.save(consulta);
    }
    
    public Consulta findById(long id){
        Optional<Consulta> resultado = repository.findById(id);
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
