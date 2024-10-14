
/*
Escreva um algoritmo para ler as dimensões de uma cozinha retangular
(comprimento, largura e altura), calcular e escrever a quantidade de caixas de
azulejos para se colocar em todas as suas paredes (considere que não será
descontada a área ocupada por portas e janelas). Cada caixa de azulejos possui 1.5
m2
*/
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double comprimento, largura, altura;

        System.out.println("qual o comprimento da cozinha retangular? ");
        comprimento = in.nextDouble();
        System.out.println("qual a largura da cozinha retangular? ");
        largura = in.nextDouble();
        System.out.println("qual a altura da cozinha retangular? ");
        altura = in.nextDouble();

        double areaParedes = 2 * (comprimento * altura) + 2 * (largura * altura);

        double cadaCaixa = 1.5;

        int caixasNecessarias = (int) (areaParedes / cadaCaixa);
        System.out.println("quantidade de caixar de azulejo necessárias são: " + caixasNecessarias + " caixas ");

    }

}
