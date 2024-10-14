/*
Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
mensagem de erro.
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 20;
        int b = 0;
        int divisao = (a/b);

        System.out.println("o resultado é: " +divisao);

        in.close();
    }
}
