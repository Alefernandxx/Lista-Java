
import java.util.Scanner;

/*
Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
(considerar que média igual ou maior que 6.0 o aluno é aprovado). Escrever também
a média calculada 
*/

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota1;
        int nota2;

        System.out.println("A nota da 1a é: ");
        nota1 = in.nextInt();
        System.out.println("A nota da 2a é: ");
        nota2 = in.nextInt();

        int mediaArit = (nota1 + nota2) / 2;
        int media = 6;

        if (mediaArit >= media) {
            System.out.println("Você passou!");
            System.out.println("a média é: " + mediaArit);

        } else {
            System.out.println("Você rodou ");
            System.out.println("a média é: " + mediaArit);

            in.close();
        }
    }
}
