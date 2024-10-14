
/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
custo final ao consumidor. 
*/
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double custoDeFabrica;

        System.out.println("custo de fábrica de um carro é: ");
        custoDeFabrica = in.nextDouble();

        double percentualDistribuidor = custoDeFabrica * 0.28;
        double impostos = custoDeFabrica * 0.45;

        double custoCarroNovo = custoDeFabrica + percentualDistribuidor + impostos;

        System.out.println("o custo final é: " + custoCarroNovo);

        in.close();

        

    }
}
