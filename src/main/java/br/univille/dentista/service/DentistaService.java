package br.univille.dentista.service;

import br.univille.dentista.entity.Dentista;

public interface DentistaService {

    Object getAll();

    void save(Dentista dentista);

    Dentista findById(long id);

    void delete(long id);

}
