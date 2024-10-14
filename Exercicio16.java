
import java.util.Scanner;

/*
Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação
não pode ultrapassar 30% do salário. Faça um programa que receba o salário, o
valor do empréstimo e o número de prestações e informe se o empréstimo pode ser
concedido. Nenhum dos valores informados pode ser zero ou negativo. 
*/

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float salario;
        float valorEmprestimo;
        int numeroPrestacoes;

        System.out.println("o salário é ");
        salario = in.nextFloat();
        System.out.println("o valor do emprestimo é ");
        valorEmprestimo = in.nextFloat();
        System.out.println("o numero de prestações é ");
        numeroPrestacoes = in.nextInt();
        
        float valorPrestacao = valorEmprestimo/numeroPrestacoes;
        float limitePrestacao = (float) (salario * 0.3);

        if (valorPrestacao <= limitePrestacao) {
            System.out.println("Emprestimo concedido ");

            
        } else {
            System.out.println("Emprestimo negado ");

        
        in.close();
        }

    }
}
