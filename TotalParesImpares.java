import java.util.Scanner;

public class TotalParesImpares {
    public static void main(String[] args) {
        int numero, cont, totpar, totimpar; 
        Scanner teclado = new Scanner(System.in);
        totpar = 0;
        totimpar = 0;
        for (cont = 1; cont <= 10; cont++) {
            System.out.print("Digite o " + cont + "º número: ");
            numero = teclado.nextInt();
            if (numero % 2 == 0) { 
                totpar++;
            } else {
                totimpar++;
            }
        }
        System.out.println();
        System.out.println("O total de PARES: " + totpar);
        System.out.println("O total de ÍMPARES: " + totimpar);
        teclado.close();
    }
}
