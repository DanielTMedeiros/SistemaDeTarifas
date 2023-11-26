package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.*;
public class TestesComLog {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestesComLog.class);
    double saldo = 1000;

    @Test
    @DisplayName("Calcula valores de saldo e tarifa de uma CI")
    public void calculaContaInternacional(){

        LOGGER.info("Incializando o método");
        //LOGGER.error();

        double saldoInternacional = saldo * 4.8;
        double valorTarifa = Math.round(saldoInternacional * 0.025);
        saldoInternacional -= valorTarifa;
        LOGGER.debug("valor esperado: 120 | valorTarifa: 120");
        assertEquals(120, valorTarifa);
        assertEquals(4680, saldoInternacional);
    }
}
