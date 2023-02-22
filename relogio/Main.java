package relogio;

public class Main {
    public static void main(String[] args) {
        Relogio hora = new Relogio(0, 0, 0);
        hora.setHora(12);
        hora.setMinuto(43);
        hora.setSegundo(45);
        hora.exibirHora();

    }
}
