package br.univille.dentista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.univille.dentista.entity.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta,Long> {
    
}
