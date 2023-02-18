import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double salario, aumentoSalario;
        System.out.println("Olá, colaborador!");
        System.out.println("Digite o seu salário: R$ ");
        salario = teclado.nextDouble();
        System.out.println();
        aumentoSalario = salario + (salario * 20 / 100);
        System.out.println("Parabéns! Você recebeu um aumento de 20%.");
        System.out.println("Seu novo salário: R$ " + aumentoSalario);
        teclado.close();
    }
}
