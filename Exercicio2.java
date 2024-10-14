
import java.util.Scanner;

/*
Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
calcular e escrever a área e o perímetro do retângulo. 
*/

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base, altura;
        
        System.out.println("Digite o valor da base e altura: ");
        base = in.nextInt();
        altura = in.nextInt();
        

        int area = (base * altura) /2;
        System.out.println("A área é: " +area);

        int perimetro = (base + altura + base + altura);
        System.out.println("o perimetro é: "+ perimetro);

        in.close();
    }
    
}
