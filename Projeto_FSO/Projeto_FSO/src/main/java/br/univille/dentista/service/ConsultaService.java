package br.univille.dentista.service;

import java.util.List;
import br.univille.dentista.entity.Consulta;

public interface ConsultaService {
    List<Consulta> getAll();
    void save(Consulta consulta);
    public Consulta findById(long id);
    void delete(long id);
}
