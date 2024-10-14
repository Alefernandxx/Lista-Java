
import java.util.Scanner;

/*
Faça um programa que receba dois números e efetua a adição. Caso o valor
somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso
o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se
10. 
*/

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int soma = n1 + n2;

        if (soma > 20) {
            soma += 8;
            System.out.println("o valor é: " + soma);

        } else if (soma <= 20) 

        {
            soma -= 10;
            System.out.println("o valor é: " + soma);

            in.close();

        }

    }
}