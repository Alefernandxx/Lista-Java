import java.util.Scanner;

public class sla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das coordenadas do retângulo
        System.out.print("Digite o valor de X1: ");
        int x1 = scanner.nextInt();

        System.out.print("Digite o valor de Y1: ");
        int y1 = scanner.nextInt();

        System.out.print("Digite o valor de X2: ");
        int x2 = scanner.nextInt();

        System.out.print("Digite o valor de Y2: ");
        int y2 = scanner.nextInt();

        // Entrada das coordenadas do ponto
        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        // Verificação se o ponto está dentro, na borda ou fora do retângulo
        
        if (x > x1 && x < x2 && y > y1 && y < y2) {
            System.out.println("O ponto está dentro do retângulo.");
        } else if ((x == x1 || x == x2) && (y >= y1 && y <= y2) ||
                (y == y1 || y == y2) && (x >= x1 && x <= x2)) {
            System.out.println("O ponto está na borda do retângulo.");
        } else {
            System.out.println("O ponto está fora do retângulo.");
        }

        scanner.close();
    }
}