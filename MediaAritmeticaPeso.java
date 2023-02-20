import java.util.Scanner;

public class MediaAritmeticaPeso {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a 1ª nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        nota2 = teclado.nextDouble();
        media = (nota1 * 0.40) + (nota2 * 0.60);
        if (media >= 6) {
            System.out.println("Parabéns! Você foi aprovado.");
            System.out.println(media);
        } else {
            System.out.println("Estude mais! Você não foi aprovado.");
            System.out.println(media);
        }

        teclado.close();
    }
}
