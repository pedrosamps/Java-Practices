import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a 1ª nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        nota2 = teclado.nextDouble();
        System.out.println();
        media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        teclado.close();
    }
}
