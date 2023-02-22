package veiculos;

public class Veiculos {
    String modelo, marca;
    double consumo; 

    // Construtor
    public Veiculos (String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    // Método
    public void MeuCarro() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Consumo: " + consumo);
    }
}
