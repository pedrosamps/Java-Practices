import java.util.Scanner;

public class MenorNumeroMetodo {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        num1 = teclado.nextInt();
        System.out.print("Digite o 2º número: ");
        num2 = teclado.nextInt();
        System.out.print("Digite o 3º número: ");
        num3 = teclado.nextInt();
        MenorNumero(num1, num2, num3);
        teclado.close();
    }

    static void MenorNumero(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.print("Menor: " + a);
        } 
        if (b < a && b < c) {
            System.out.print("Menor: " + b);
        } 
        if (c < a && c < b) {
            System.out.print("Menor: " + c);
        }
    }
}

