import java.util.Scanner;

public class ParImparMetodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDigitado; 
        System.out.println("Digite um número: ");
        numeroDigitado = teclado.nextInt();
        ParImpar(numeroDigitado);
        teclado.close();
    }

    
    static void ParImpar (int numero) {
        if (numero % 2 == 0) {
            System.out.println("PAR!");
        } else {
            System.out.println("ÍMPAR!");
        }
    }
}
