package org.example;

import org.example.contas.ContaCorrente;
import org.example.contas.ContaCripto;
import org.example.contas.ContaInternacional;
import org.example.gerenciador.GerenciadorDeTarifa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Scanner sc = new Scanner(System.in);
        GerenciadorDeTarifa sistemaTarifa = new GerenciadorDeTarifa();
        ContaCorrente contaCorrente;
        ContaInternacional contaInternacional;
        ContaCripto contaCripto;

        while (true){
            System.out.println("Informe o tipo de conta.");
            System.out.println("1 - Conta Corrente, 2 - Conta Internacional, 3 - Conta Cripto: ");
            int opcaoConta = sc.nextInt();
            sc.nextLine();
            if (opcaoConta == 1){
                System.out.println("Conta corrente selecionada. Informe o valor do saldo(em R$): ");
                double valorSaldoCC = sc.nextDouble();
                sc.nextLine();
                contaCorrente = new ContaCorrente(valorSaldoCC);
                sistemaTarifa.acumula(contaCorrente);
                System.out.println("Tarifa acumulada: " + sistemaTarifa.getTarifaTotal());
                System.out.println("Saldo acumulado: " + sistemaTarifa.getSaldoTotal());
                System.out.println("Pressione y para continuar ou pressione qualquer outra tecla para encerrar o programa: ");
                String resposta = sc.nextLine();
                if(!resposta.equals("y")){
                    System.out.println("Encerrando o programa..");
                    break;
                }
            }
            if(opcaoConta == 2){
                System.out.println("Conta internacional selecionada. Informe o valor do saldo(em R$): ");
                double valorSaldoCI = sc.nextDouble();
                sc.nextLine();
                contaInternacional = new ContaInternacional(valorSaldoCI);
                sistemaTarifa.acumula(contaInternacional);
                System.out.println("Tarifa acumulada: " + sistemaTarifa.getTarifaTotal());
                System.out.println("Saldo acumulado: " + sistemaTarifa.getSaldoTotal());
                System.out.println("Pressione y para continuar ou pressione qualquer outra tecla para encerrar o programa: ");
                String resposta = sc.nextLine();
                if(!resposta.equals("y")){
                    System.out.println("Encerrando o programa..");
                    break;
                }
            }
            if(opcaoConta == 3){
                System.out.println("Conta cripto selecionada. Informe o valor do saldo(em R$): ");
                double valorSaldoCP = sc.nextDouble();
                sc.nextLine();
                contaCripto = new ContaCripto(valorSaldoCP);
                sistemaTarifa.acumula(contaCripto);
                System.out.println("Tarifa acumulada: " + sistemaTarifa.getTarifaTotal());
                System.out.println("Saldo acumulado: " + sistemaTarifa.getSaldoTotal());
                System.out.println("Pressione y para continuar ou pressione qualquer outra tecla para encerrar o programa: ");
                String resposta = sc.nextLine();
                if(!resposta.equals("y")){
                    System.out.println("Encerrando o programa..");
                    break;
                }
            }
            else{
                System.out.println("Valor informado incorretamente. Tente novamente!");
            }
        }
    }
}
