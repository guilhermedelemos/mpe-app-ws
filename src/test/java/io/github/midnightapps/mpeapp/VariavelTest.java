package io.github.midnightapps.mpeapp;

import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VariavelTest {
    @Test
    public void instanciaTest() {
        int id = ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE);
        String nome = "V1";
        Variavel v1 = new Variavel(id, nome);
        assertNotNull(v1);
        assertEquals(id, v1.getId());
        assertEquals(nome, v1.getNome());
    }
}
