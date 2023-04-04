package br.univille.dentista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.dentista.entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Long> {
    
}
