package io.github.midnightapps.mpeapp.controller;

import io.github.midnightapps.mpeapp.repository.LogRepository;
import io.github.midnightapps.mpeapp.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;

@RestController
public class LogController {
    @Autowired
    private LogRepository logRepository;

    @RequestMapping("/log")
    public List<Log> log() {
        Log log = new Log("Teste", Calendar.getInstance().getTime());
        logRepository.save(log);
        return logRepository.findAll();
    }

    @RequestMapping(value = {"/v1/log/{id}", "/log/{id}"}, method = RequestMethod.GET)
    public Log logById(@PathVariable Long id) {
        Log log = new Log("GET", Calendar.getInstance().getTime());
        log.setId(id);
        return log;
    }

}
