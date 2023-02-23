package ebook;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        //this.paginalAtual = paginalAtual;
    }

    public void avancarPagina () {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }
    
    public void retrocederPagina () {
        if (paginaAtual > 0) {
            paginaAtual--;
        }
    }

    public void irParaPagina (int pagina) {
        if (pagina >= 0 && pagina <= totalPaginas) {
            paginaAtual = pagina;
        }
    }

    public int exibirPagina () {
        return paginaAtual;
    }


    public void exibirCapa() {
        System.out.print("Título: " + titulo + "\nAutor: " + autor + "\nTotal de Páginas: " + totalPaginas);
    }
}
