package org.example.contas;

import org.example.tarifas.ITarifa;

public class ContaCripto extends Conta implements ITarifa {
    private double valorTarifa;

    public ContaCripto(double saldo){
        this.saldo = saldo*4.8;
    }
    public double calcula(){
        return valorTarifa =0;
    }

}
