import java.util.Scanner;

public class SequenciaNumerica {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número e veja sua sequência: ");
        numero = teclado.nextInt();
        for (int cont = 1; cont <= numero; cont*=2) {
            if (cont == numero) {
                System.out.print(cont);
            } else {
                System.out.print(cont + ", "); 
            }
        }
        teclado.close();
    }
}
