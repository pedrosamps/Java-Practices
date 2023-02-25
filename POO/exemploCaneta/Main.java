package POO.exemploCaneta;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta(null, 0);
        caneta1.setModelo("BIC Cristal");
        caneta1.setPonta(0.5f);
        caneta1.status();
    }
}
