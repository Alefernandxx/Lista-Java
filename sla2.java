
import java.util.Scanner;

public class sla2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X1: ");
        int x1 = scanner.nextInt();

        System.out.print("Digite o valor de Y1: ");
        int y1 = scanner.nextInt();

        System.out.print("Digite o valor de X2: ");
        int x2 = scanner.nextInt();

        System.out.print("Digite o valor de Y2: ");
        int y2 = scanner.nextInt();

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        if (x > x1 && x < x2 && y > y1 && y < y2) {
            System.out.println("Está dentro");

        } else if ((x == x1 || x == x2) && (y >= y1 && y <= y2) || (y == y1 || y == y2) && (x >= x1 && x <= x2)) {
            System.out.println("Está na borda! ");

        } else {
            System.out.println("Está fora");
        }

    }
}
