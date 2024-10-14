
import java.util.Scanner;

/*
As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$
1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número
de maçãs compradas, calcule e escreva o custo total da compra. 
*/

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numeroDeMaca;
        float custoTotal;

        System.out.println("Digite o numero de maças compradas: ");
        numeroDeMaca = in.nextInt();

        if (numeroDeMaca < 12) {
            custoTotal = (float) (numeroDeMaca * 1.50);
            System.out.println("Custo total é " + custoTotal);

        } else if (numeroDeMaca >= 12) {
            custoTotal = (float) (numeroDeMaca * 1.30);
            System.out.println("Custo total é " + custoTotal);

            in.close();

        }
        

    }
}
