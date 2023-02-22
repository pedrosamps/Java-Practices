package relogio;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio (int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }


    public int getHora() {
        return hora;
    }

    public void setHora(int newHora) {
        if (hora >= 0  && hora < 24) {
            this.hora = newHora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int newMinuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = newMinuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int newSegundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = newSegundo;
        }
    }

    public void exibirHora() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
}
