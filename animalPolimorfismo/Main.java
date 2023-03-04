package animalPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.reagir("Olá");
        c.reagir(11, 45);
        c.reagir(true);
        c.reagir(false);
    }
}
