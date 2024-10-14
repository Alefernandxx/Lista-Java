
import java.util.Scanner;

/*
Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692
Diametro = 2.r
Comprimento = 2πr
Area = πr²
*/

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        

        float raio;

        System.out.println("Qual o raio de uma circunferência? ");
        raio = in.nextFloat();

        float diametro = 2 * raio;
        System.out.println("o diamentro é: " + diametro);

        Double pi = 3.141692;
        Double comprimento = (2 * pi * raio);
        System.out.println("O comprimento é: " + comprimento);

        Double area = pi * (raio * raio);
        System.out.println("A área da circunferência é: " + area);

        in.close();
        
        
    
    

        

        

        

    }
    
     
}

