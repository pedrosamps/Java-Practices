package dadosFileException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("dadosfileexception/main/arquivo.txt");
        if(file.exists()) {
            exibirConfig(file);
        } else {
            gravarConfig(file);
        }
    }

   

    static void exibirConfig(File file) throws IOException {
        Scanner input = new Scanner(file);

        System.out.println("Configurações atuais: ");
        while (input.hasNext()) {
            String linha = input.nextLine();
            System.out.println(linha);
        }
        input.close();
    }

    static void gravarConfig(File file) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String nome, modo, idioma;

        System.out.println("Nome do perfil: ");
        nome = scanner.nextLine();
        System.out.println("Modo de tela (Claro/Noturno): ");
        modo = scanner.nextLine();
        System.out.println("Idioma (BR/US): ");
        idioma = scanner.nextLine();

        FileWriter fWriter = new FileWriter(file);
        
        
        fWriter.write(nome);
        fWriter.write(modo);
        fWriter.write(idioma);

        fWriter.close();
        scanner.close();
    }
}
