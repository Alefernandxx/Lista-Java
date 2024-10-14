
import java.util.Scanner;

/*
Faça um programa que receba a idade de um nadador e classifique-o numa das
seguintes categorias:

• Adulto (idade >= 18);
• Juvenil (idade >= 14 e idade < 18);
• Infantil (idade >=9 e idade < 14);
• Mirim (Idade < 9).
*/

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idadeNadador = 15;

        if (idadeNadador >= 18) {
            System.out.println("ADULTO ");

        } else if (idadeNadador >= 14 && idadeNadador < 18) {
            System.out.println("JUVENIL ");
        } else if (idadeNadador >= 9 && idadeNadador < 14) {
            System.out.println("INFANTIL ");
        } else if (idadeNadador < 9) {
            System.out.println("MIRIM");

            in.close();
        }

    }

}
