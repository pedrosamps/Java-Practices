package POO.exemploCaneta;

public class Caneta {
    public String modelo;
    private float ponta;


    public Caneta(String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
        modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
        ponta = p;
    } 

    public void status() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
    }
    
}
