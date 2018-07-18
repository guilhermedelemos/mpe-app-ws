package io.github.midnightapps.mpeapp;

import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/fazenda-urbana")
    public Leitura fazendaUrbana() {
        Variavel temperaturaAr = new Variavel(ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE), "Temperatura do Ar");
        Leitura leitura = new Leitura(ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE), temperaturaAr, Calendar.getInstance().getTime(), ThreadLocalRandom.current().nextDouble(-20, 50));
        return leitura;
    }
}
