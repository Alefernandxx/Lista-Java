/*
Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
deles é o maior, imprimindo na resposta o nome da variável e o seu valor
 */

 import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = 80;
        int B = 90;

        if (A > B) {
            System.out.println("o valor A é: " + A);
            System.out.println("o maior valor é A ");

            
        }
        else if (B > A) {
            System.out.println("o valor B é: " + B);
            System.out.println("o maior valor é B ");

        }



        
        in.close();
    }
}
