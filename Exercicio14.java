
import java.util.Scanner;

/*
Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
em que a pessoa nasceu). 
*/

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int anoAtual;
        int anoNascimento;

        System.out.println("O ano atual é: ");
        anoAtual = in.nextInt();
        System.out.println("O ano de nascimento da pessoa é: ");
        anoNascimento = in.nextInt();

        int praVotar = (anoAtual - anoNascimento);

        if (praVotar >= 18) {
            System.out.println("Você pode votar!");

        } else {
            System.out.println("Você não tem idade para votar ");


            in.close();


            
        }
        

    }
}
