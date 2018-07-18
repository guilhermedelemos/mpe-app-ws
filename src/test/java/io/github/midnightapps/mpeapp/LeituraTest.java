package io.github.midnightapps.mpeapp;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LeituraTest {
    @Test
    public void instanciaTest() {
        Variavel v1 = new Variavel(ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE), "V1");

        int id = ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE);
        Date dataLeitura = Calendar.getInstance().getTime();
        double valorLeitura = ThreadLocalRandom.current().nextDouble(-20, 50);

        Leitura leitura = new Leitura(id, v1, dataLeitura, valorLeitura);

        assertNotNull(leitura);
        assertNotNull(leitura.getVariavel());
        assertEquals(id, leitura.getId());
        assertEquals(dataLeitura, leitura.getDataLeitura());
        assertEquals(valorLeitura, leitura.getValor(), 0.1);
    }
}
