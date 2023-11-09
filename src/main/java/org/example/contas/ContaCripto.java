package org.example.contas;

public class ContaCripto extends Conta{
    private double valorTarifa;

    public ContaCripto(double saldo){
        this.saldo = saldo*4.8;
    }
}
