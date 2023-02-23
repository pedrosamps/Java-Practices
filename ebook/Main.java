package ebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String titulo, autor;
        int numeroPaginas, opcao = 0;
        Ebook livro;

        System.out.println("Título do livro: ");
        titulo = entrada.nextLine();
        System.out.println("Autor: ");
        autor = entrada.nextLine();
        System.out.println("Páginas: ");
        numeroPaginas = entrada.nextInt();

        livro = new Ebook(titulo, autor, numeroPaginas);

        System.out.println("--------------");
        while (opcao != 4) {
            System.out.println("1 - Mostrar capa");
            System.out.println("2 - Próxima página");
            System.out.println("3 - Página anterior");
            System.out.println("4 - Fim");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    livro.exibirCapa();
                    break;
                case 2:
                    livro.avancarPagina();
                    System.out.println("Página avançada: " + livro.exibirPagina());
                    break;
                case 3: 
                    livro.retrocederPagina();
                    System.out.println("Página anterior: " + livro.exibirPagina());
                    break;
                case 4: 
                    System.out.println("Fim");
                    break;
                default: 
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
        entrada.close();
    }
}
