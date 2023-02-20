import java.util.Scanner;

public class MetadeNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero, metade; 
        System.out.println("Digite um número: ");
        numero = teclado.nextInt();
        metade = numero / 2; 
        System.out.println();
        if (numero > 20) {
            System.out.println("A metade do número digitado é: " + metade);
        } else {
            System.out.println("Você digitou: " + numero);
        }
        
        teclado.close();
    }
    
}