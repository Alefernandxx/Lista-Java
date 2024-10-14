
import java.util.Scanner;

//Faça um algoritmo que converta metros para centímetros. Lembrando que 1m = 100 cm

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int metros;

        System.out.println("Digite os metros: ");
        metros = in.nextInt();
        
        int converter = (metros * 100);

        System.out.println("A conversão é: " + converter + "cm");

        in.close();
    }
}
