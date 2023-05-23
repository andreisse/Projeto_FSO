package br.univille.dentista.service;

import java.util.List;
import br.univille.dentista.entity.Paciente;

public interface PacienteService {
    List<Paciente> getAll();
    void save(Paciente paciente);
    Paciente findById(long id);
    void delete(long id);
}
