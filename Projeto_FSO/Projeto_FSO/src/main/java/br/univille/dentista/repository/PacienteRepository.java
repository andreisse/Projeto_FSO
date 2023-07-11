package br.univille.dentista.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.dentista.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {

    default List<Paciente> getAll() {
        return findAll();
    }
}
