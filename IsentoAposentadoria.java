import java.util.Scanner;

public class IsentoAposentadoria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;
        System.out.println("Digite o seu salário: R$ ");
        salario = teclado.nextDouble();
        if (salario <= 600) {
            System.out.println("Isento de contribuição");
        } else {
            if (salario <= 1200) {
                System.out.println("20% de desconto");
            } else {
                if (salario <= 2000) {
                    System.out.println("25% de desconto");
                } else {
                    System.out.println("30% de desconto.");
                }
            }
        }
        teclado.close();
    }
}
