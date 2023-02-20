import java.util.Scanner;

public class PontosFlutuantesDecrescente {
    public static void main(String[] args) {
        float numero1, numero2; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número flutuante: ");
        numero1 = teclado.nextFloat();
        System.out.println("Digite outro número flutuante: ");
        numero2 = teclado.nextFloat();
        if (numero1 > numero2) {
            System.out.println(numero1 + " " + numero2);
        } else {
            System.out.println(numero2 + " " + numero1);
        }
        teclado.close();
    }
}
