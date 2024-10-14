/*
Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
referido mês e qual será seu salário atual. Calcule também o salário líquido
(desconto de impostos) considerando 15% de impostos e mostre esses valores.

a. Pergunte ao usuário qual a % de imposto que é descontada do salário.
*/
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int horasTrabMes;
        float ganhaPorHora;

        
        System.out.println("Quanto você ganha por hora? ");
        ganhaPorHora = in.nextFloat();

        System.out.println("Quantas horas por mês você trabalha? ");
        horasTrabMes = in.nextInt();

        float salario = (ganhaPorHora * horasTrabMes);
        System.out.println("salario total é: " + salario);


        float imposto = (salario * 15/100);
        float imposto2 = (imposto / 100);
        System.out.println("Qual a % de imposto descontada do seu salário? "+ imposto2 + "%");




        in.close();
    }
}
