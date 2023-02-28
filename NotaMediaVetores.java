import java.util.Scanner;

public class NotaMediaVetores {
    public static void main(String[] args) {
        double [] notas = new double [10];
        double media = 0;
        int totNota = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
            media += notas[i];
        }
        media = media / 10;

        System.out.println("Todos as notas digitadas");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " | ");
        }
        System.out.println();

        System.out.println("Notas acima da média: ");
        for (int i = 0; i < notas.length; i++) {
            if (media < notas[i]) {
                System.out.print(notas[i] + " | ");
                totNota++;
            }
        }

        System.out.println();
        System.out.println("A média da turma: " + media);
        System.out.println("Total de notas acima da média: " + totNota);
        

        
        teclado.close();
    }
}   
