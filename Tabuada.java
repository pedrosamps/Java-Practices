import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int tabuada; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número e veja sua tabuada: ");
        tabuada = teclado.nextInt();
        for (int cont = 0; cont <= 10; cont++) {
            System.out.println(tabuada + " X " + cont + " = " + (tabuada * cont));
        }
        teclado.close();
    }
}
