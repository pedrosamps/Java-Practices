import java.util.Scanner;

public class LinhaDeCredito {
    public static void main(String[] args) {
        double salario, valorPrestacao, valorMaximoCredito;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu salário: R$ ");
        salario = teclado.nextDouble();
        System.out.print("Digite o valor da prestação: R$ ");
        valorPrestacao = teclado.nextDouble();
        valorMaximoCredito = salario * 0.30;
        if (valorPrestacao > valorMaximoCredito) {
            System.out.println("R$ " + valorMaximoCredito);
            System.out.println("NEGADO! Você não tem permissão para abrir esta linha de crédito.");
        } else {
            System.out.println("R$ " + valorMaximoCredito);
            System.out.println("CONCEDIDO! Você tem permissão para abrir esta linha de crédito.");
        }
        teclado.close();
    }
}
