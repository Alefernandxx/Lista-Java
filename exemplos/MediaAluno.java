package exemplos;




import java.util.Scanner;

// CALCULA A MEDIA E MOSTRA SE O ALUNO FOI APROV OU RECUPERACAO
// >= 7  APROV
// <  7  RECUP

    public class MediaAluno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota1, nota2; 

        System.out.println("Digite as notas que o aluno tirou ");
        nota1 = in.nextInt();
        nota2 = in.nextInt();

        int media = (nota1 + nota2) /2;

        boolean resultado = media >=7;


        System.out.println(resultado);

        if (media >= 7) {
            System.out.println("Você passou! ");


        }
        
        else if (nota1 < 7 && nota2 > 7) {
            System.out.println("Você rodou");
            
        }

        else if (nota2 < 7 && nota1 > 7) {
            System.out.println("Voce rodou");
            
        

        } else {
            System.out.println("Você não passou ");

        }
        
        in.close();
    }
}
