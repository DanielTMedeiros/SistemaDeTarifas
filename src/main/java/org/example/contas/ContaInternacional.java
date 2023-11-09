package org.example.contas;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.ITarifa;

@Getter@ Setter
public class ContaInternacional extends Conta implements ITarifa {
    private double valorTarifa;
    public ContaInternacional(double saldo){
        this.saldo = saldo*4.8;
    }
    public double calcula(){
        valorTarifa = Math.round(saldo*0.025);
        saldo -= valorTarifa;
        return valorTarifa;
    }
}
