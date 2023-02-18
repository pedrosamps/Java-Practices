import java.util.Scanner;

public class Quilowatt {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioMinimo, valorKw, valorAPagar, valorDesconto;
        int qtdeKw;
        System.out.println("Salário Mínimo: R$ ");
        salarioMinimo = teclado.nextDouble();
        System.out.println("Quantidade de KW: ");
        qtdeKw = teclado.nextInt();
        valorKw = salarioMinimo / 500;
        valorAPagar = qtdeKw * valorKw;
        valorDesconto = valorAPagar * 0.15;
        // saída de dados
        System.out.println("Um Kw custa: R$ " + valorKw);
        System.out.println("Valor a ser pago: R$ " + valorAPagar);
        System.out.println("Valor com desconto: R$ " + valorDesconto);

        teclado.close();
    }
}
