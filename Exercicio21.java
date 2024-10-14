
import java.util.Scanner;

/*
A equipe Red Bull Racing de Fórmula 1 deseja calcular o número mínimo de litros
que deverá colocar no tanque de seu carro para que ele possa percorrer um
determinado número de voltas até o primeiro reabastecimento. Escreva um
algoritmo que leia o comprimento da pista (em metros), o número total de voltas a
serem percorridas no grande prêmio, o número de reabastecimentos desejados e o
consumo de combustível do carro (em Km/L). 

Calcular e escrever o número mínimo 
de litros necessários para percorrer até o primeiro reabastecimento. Observação:
Considere que o número de voltas entre os reabastecimentos é o mesmo.
*/

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Comprimento da pista é: ");
        int comprimento = in.nextInt();
        System.out.println("Número total de voltas é: ");
        int totalVoltas = in.nextInt();
        System.out.println("O número de reabastecimentos é: ");
        int reabastecimento = in.nextInt();
        System.out.println("O consumo de combustível do carro é: ");
        float consumo = in.nextFloat();

        Double compPistaKm = comprimento / 1000.0;

        int numVoltasAbastecimento = totalVoltas / (reabastecimento + 1);

        double distanciaPerc = numVoltasAbastecimento * compPistaKm;

        double LitrosNecessarios = distanciaPerc / consumo;

        System.out.printf("O número minimo de litros é: %.2f L\n", LitrosNecessarios);

    }

}
