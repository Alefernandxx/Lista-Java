/*
Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
Também testar se saldo atual for maior ou igual a zero escrever a mensagem “Saldo
Positivo”, senão escrever a mensagem “Saldo Negativo”. 
*/

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Numero da conta: ");
        double contaCliente = in.nextDouble();
        System.out.println("O saldo é: ");
        double saldo = in.nextDouble();
        System.out.println("O debito é: ");
        double debito = in.nextDouble();
        System.out.println("O crédito é: ");
        double credito = in.nextDouble();

        Double saldoAtual = saldo - debito + credito;

        System.out.println("O saldo atual é: " + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");

        } else {
            System.out.println("Saldo Negativo");
        }

    }

}
