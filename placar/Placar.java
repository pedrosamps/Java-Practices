package placar;

public class Placar {
    String time1, time2;
    int gol, gol2;


    public Placar() {
        time1 = "Time da Casa";
        time2 = "Time Adversário";
    }

    public Placar(String time1, String time2) {
        this.time1 = time1;
        this.time2 = time2;
        
    }

    public Placar(String time1, String time2, int gol, int gol2) {
        this.time1 = time1;
        this.time2 = time2;
        this.gol = gol;
        this.gol2 = gol2;
    }

    public String exibir() {
        return time1 + " " + gol + " x " + gol2 + " " + time2;
    }
}
