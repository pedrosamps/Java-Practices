package viewsVideoPoo;

public class Video implements AcoesVideos {
    private String titulo;
    private int avalicao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;


    public Video(String titulo) {
        this.titulo = titulo;
        this.avalicao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Vídeo{ Título= " + titulo + ", Avaliação=" + avalicao + ", Views=" + views + ", Curtidas=" + curtidas;
    }

    
    // Métodos Getters e Setters
     public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(int avalicao) {
        this.avalicao = avalicao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
