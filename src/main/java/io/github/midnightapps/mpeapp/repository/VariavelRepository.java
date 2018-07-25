package io.github.midnightapps.mpeapp.repository;

import io.github.midnightapps.mpeapp.model.Variavel;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface VariavelRepository extends CrudRepository<Variavel, Integer> {

    List<Variavel> findAll();
    List<Variavel> findByNome(String nome);

}
