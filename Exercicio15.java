
import java.util.Scanner;

/*
Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um
dia e terminar no dia seguinte 
*/

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int horaInicial;
        int horaFinal;

        System.out.println("informe o horario do inicio do jogo: ");
        horaInicial = in.nextInt();
        System.out.println("Informe o horario do final do jogo ");
        horaFinal = in.nextInt();

        int duracaoHoras = horaFinal - horaInicial;
        int dia = duracaoHoras + 24;

        if (horaFinal < horaInicial) {
            System.out.println("o jogo teve " + dia);

        } else {
            System.out.println("o jogo teve " + duracaoHoras);

            in.close();
        }

    }
}
