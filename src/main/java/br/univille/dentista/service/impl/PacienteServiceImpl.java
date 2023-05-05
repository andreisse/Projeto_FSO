package br.univille.dentista.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.dentista.entity.Paciente;
import br.univille.dentista.repository.PacienteRepository;
import br.univille.dentista.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository repository;

    @Override
    public List<Paciente> getAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public void save(Paciente paciente) {
        // TODO Auto-generated method stub
        repository.save(paciente);
    }

    
    public Paciente findById(long id){
        Optional<Paciente> resultado = repository.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return null;
    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
