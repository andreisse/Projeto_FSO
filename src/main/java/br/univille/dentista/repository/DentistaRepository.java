package br.univille.dentista.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.dentista.entity.Dentista;

public interface DentistaRepository extends JpaRepository<Dentista,Long> {

    default List<Dentista> getAll() {
        return findAll();
    }
    
}
