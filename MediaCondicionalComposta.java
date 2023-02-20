import java.util.Scanner;

public class MediaCondicionalComposta {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a 1ª nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        nota2 = teclado.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media < 5) {
            System.out.println("Reprovado!");
        } else {
            if (media < 7) {
                System.out.println("Recuperação. Estude mais!");
            } else {
                System.out.println("Aprovado. Boas férias!");
            }
        }
        teclado.close();
    }
}
