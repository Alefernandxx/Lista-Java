
import java.util.Scanner;

/*
Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
Sabendo-se que o preço do combustível é de R$ 4.59, escreva um algoritmo para
ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia,
o número de litros de combustível gasto e o valor total (R$) recebido dos
passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido)
do dia. 
*/

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("marcação do odômetro no inicio do dia (Km) ");
        double marcacaoOdometroInicio = in.nextDouble();
        System.out.println("marcação do odômetro no final do dia (Km) ");
        double marcacaoOdometroFim = in.nextDouble();
        System.out.println("A quantidade de litros de combustivel gasto ");
        double quantLitrosCombustivelGasto = in.nextDouble();
        System.out.println("O valor total recebido dos passageiros é: ");
        double valorTotalPassageiros = in.nextDouble();

        double PrecoCombustivel = 4.59;


        double consumo = marcacaoOdometroFim - marcacaoOdometroInicio;
        double consumo2 = (consumo / quantLitrosCombustivelGasto);
        System.out.println("a média do consumo em km/l é: " + consumo2);

        double custoCombustivel = PrecoCombustivel * quantLitrosCombustivelGasto;
        double lucroLiquido = (valorTotalPassageiros - custoCombustivel);
        System.out.println("o lucro líquido do dia é: " + lucroLiquido);





    }
    
}
