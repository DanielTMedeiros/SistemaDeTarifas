package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AppTest
{
    double saldo = 1000;

    @Test
    @DisplayName("Calcula valores de saldo e tarifa de uma CI")
    public void calculaContaInternacional(){
        double saldoInternacional = saldo * 4.8;
        double valorTarifa = Math.round(saldoInternacional * 0.025);
        saldoInternacional -= valorTarifa;
        assertEquals(120, valorTarifa);
        assertEquals(4680, saldoInternacional);
    }
}
