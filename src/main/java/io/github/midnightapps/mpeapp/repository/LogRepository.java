package io.github.midnightapps.mpeapp.repository;

import java.util.List;

import io.github.midnightapps.mpeapp.model.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {

    List<Log> findByMensagem(String mensagem);
    List<Log> findAll();
}
