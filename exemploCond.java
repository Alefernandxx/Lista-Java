
import java.util.Scanner;

public class exemploCond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final String SENHA = "53578Ale#";

        System.out.println("Digite a senha: ");
        String digitado = in.next();

        boolean saoIguais = SENHA.equals(digitado);

        if (saoIguais) {
            System.out.println("Você acertou a senha ");
            
        } else {
            System.out.println("Senha incorreta!");
             
        }
        in.close();
    }
}
