package org.example.contas;

import org.example.tarifas.ITarifa;

public class ContaCorrente extends Conta implements ITarifa {
    private double valorTarifa;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    public double calcula(){
        valorTarifa = Math.round(saldo*0.015);
        saldo -= valorTarifa;
        return valorTarifa;

    }
}
