package br.univille.dentista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.dentista.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
