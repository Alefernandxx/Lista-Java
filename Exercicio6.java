/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.

a. Desafio e pesquisa: utilizando a classe Calendar ou Date do Java, peça que
o usuário informe sua data de nascimento e o sistema irá calcular quantos
anos, meses e dias a pessoa viveu.
*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int anos, meses, dias;

        System.out.println("A idade da pessoa em anos é: ");
        anos = in.nextInt();
        System.out.println("A idade da pessoa em meses é: ");
        meses = in.nextInt();
        System.out.println("A idade da pessoa em dias é: ");
        dias = in.nextInt();

        int IdadeEmDias = (anos * 365 + meses * 30 + dias);
        System.out.println("A pessoa viveu " + IdadeEmDias + " dias até hoje ");



        in.close();

    }
}
