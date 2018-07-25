package io.github.midnightapps.mpeapp.controller;

import io.github.midnightapps.mpeapp.model.Variavel;
import io.github.midnightapps.mpeapp.repository.VariavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VariavelController {
    @Autowired
    private VariavelRepository variavelRepository;

    @RequestMapping(value = {"/fazenda-urbana/variavel"}, method = RequestMethod.GET)
    public List<Variavel> listAll() {
        return variavelRepository.findAll();
    }

    @RequestMapping(value = {"/fazenda-urbana/variavel/{id}", "/v1/fazenda-urbana/variavel/{id}"}, method = RequestMethod.GET)
    public Variavel findById(@PathVariable Integer id) {
        return variavelRepository.findById(id).get()                                                                                                                                                                            ;
    }

}
