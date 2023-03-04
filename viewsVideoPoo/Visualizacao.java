package viewsVideoPoo;

public class Visualizacao {
    private Expectador espectador;
    private Video filme;

    
    public Visualizacao(Expectador espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }


    public Expectador getEspectador() {
        return espectador;
    }


    public void setEspectador(Expectador espectador) {
        this.espectador = espectador;
    }


    public Video getFilme() {
        return filme;
    }


    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualização{ Expectador=" + espectador + ", filme=" + filme;
    }
}
