package br.univille.dentista.service.impl;

import java.util.List;

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
    
}
