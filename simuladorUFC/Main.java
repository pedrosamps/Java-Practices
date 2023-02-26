package simuladorUFC;

public class Main {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];
        
        lutador[0] = new Lutador("Pedro Sampaio", "Brasil", 26, 1.80f, 84.5f, 12, 0, 4);

        lutador[1] = new Lutador("Ewok", "Brasil", 21, 1.70f, 54.5f, 5, 8, 4);

        lutador[2] = new Lutador("Homero", "Brasil", 32, 1.90f, 94.5f, 6, 2, 3);

        lutador[3] = new Lutador("Gerson", "Brasil", 42, 1.85f, 74.5f, 15, 2, 3);

        lutador[4] = new Lutador("Wilson", "Brasil", 35, 1.65f, 54.5f, 10, 8, 7);

        lutador[5] = new Lutador("Theo", "Itália", 18, 1.85f, 74.5f, 5, 1, 1);


        Luta Luta1 = new Luta();
        Luta1.marcarLuta(lutador[0], lutador[2]);
        Luta1.lutar();
        Luta1.marcarLuta(lutador[1], lutador[4]);
        Luta1.lutar();
        Luta1.marcarLuta(lutador[3], lutador[5]);
        Luta1.lutar();
    }
}
