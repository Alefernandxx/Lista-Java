
import java.util.Scanner;
/*
Escreva um algoritmo para ler o número total de eleitores de um município, o
número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
cada um representa em relação ao total de eleitores
*/
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int votosBrancos = 300;
        int nulos = 200;
        int validos = 1000; 

        int total = (votosBrancos + nulos + validos);
        
        System.out.println("o total de eleitores do municipio é: "+ total);

        int porcentagemBrancos = (votosBrancos * 100) / total;
        System.out.println("votos brancos = " + porcentagemBrancos + "%");

        int porcentagemNulos = (nulos * 100) / total;
        System.out.println("votos nulos = " + porcentagemNulos + "%");

        int votosValidos = (validos * 100) / total;
        System.out.println("votos validos = " + votosValidos + "%");



        in.close();
    }
}
