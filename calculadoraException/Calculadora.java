package calculadoraException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        try {
            System.out.println("Digite o 1º número: ");
            n1 = teclado.nextInt();
            System.out.println("Digite o 2º número: ");
            n2 = teclado.nextInt();

            System.out.println(calcula(n1, n2, '+'));
            System.out.println(calcula(n1, n2, '-'));
            System.out.println(calcula(n1, n2, '*'));
            System.out.println(calcula(n1, n2, '/'));
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero.");
        } catch (InputMismatchException e) {
            System.out.println("Digitação inválida.");
        }
        teclado.close();
    }

    private static double calcula(int n1, int n2, char operacao) throws ArithmeticException {
        switch (operacao) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                if (n2 == 0) {
                    throw new ArithmeticException("Divisão por zero");
                }
                return (double) n1 / n2;
            default:
                return -1;
            
        }
    }
}
