package org.example.contas;

import lombok.Getter;
import lombok.Setter;

@Getter@ Setter
public class ContaInternacional extends Conta {
    private double valorTarifa;
    public ContaInternacional(double saldo){
        this.saldo = saldo*4.8;
    }
}
