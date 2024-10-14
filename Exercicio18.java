/*
Uma revendedora de carros usados paga a seus funcionários vendedores um salário
fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5%
do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de
carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele
recebe por carro vendido. Calcule e escreva o salário final do vendedor.
*/
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int carrosVendidos;
        double valorTotalDeVendas;
        double salarioFixo;
        double valorRecebidoPorCarroVendido;

        System.out.println("o numero de carros vendidos é: ");
        carrosVendidos = in.nextInt();
        System.out.println("o valor total de vendas é: ");
        valorTotalDeVendas = in.nextDouble();
        System.out.println("o salário fixo é: ");
        salarioFixo = in.nextDouble();
        System.out.println("valor que recebe por carro vendido é: ");
        valorRecebidoPorCarroVendido = in.nextDouble();

        double comissaoFixa = carrosVendidos * valorRecebidoPorCarroVendido;
        double cadaVendaDeCarro = valorTotalDeVendas * 0.05;

        double salarioTotal = (salarioFixo + comissaoFixa + cadaVendaDeCarro);
        System.out.printf("o salário final do vendedor é R$: %.2f%n" , salarioTotal);
        
    }
}
