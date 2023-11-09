package org.example.gerenciador;

import lombok.Getter;
import lombok.Setter;
import org.example.contas.Conta;
import org.example.contas.ContaCorrente;
import org.example.contas.ContaInternacional;

@Getter @Setter
public class GerenciadorDeTarifa {
    private double saldoTotal;
    private double tarifaTotal;
    public void acumula(Conta conta){
        double saldo = conta.saldo;
        if(conta instanceof ContaCorrente){
            double tarifa = ((ContaCorrente) conta).calcula();
            tarifaTotal += tarifa;
            saldoTotal += saldo-tarifa;
        }
        else if(conta instanceof ContaInternacional){
            double tarifa = ((ContaInternacional) conta).calcula();
            tarifaTotal += tarifa;
            saldoTotal += saldo-tarifa;
        }
        else{
            saldoTotal+=saldo;
        }
    }
}
