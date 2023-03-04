package animalHerancaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        r.locomover();
        p.locomover();
        a.locomover();

        Canguru c = new Canguru();
        c.locomover();
    }
}
