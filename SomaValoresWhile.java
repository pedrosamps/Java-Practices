import java.util.Scanner;

public class SomaValoresWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, totSoma;
        totSoma = 0;
        do {
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();
            totSoma+=numero;
        } while (numero != 0); 
        System.out.println("A soma dos números digitados é: " + totSoma);
        teclado.close();
    }
}
