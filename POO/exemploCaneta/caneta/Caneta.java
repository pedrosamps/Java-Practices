package POO.exemploCaneta.caneta;

// APENAS PRÁTICA PARA MELHOR APRENDIZADO E ENTENDIMENTO

public class Caneta {
   public String modelo, cor;
   private float ponta;
   protected int carga;
   protected boolean tampada;

public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
    this.modelo = modelo;
    this.cor = cor;
    this.ponta = ponta;
    this.carga = carga;
    this.tampada = tampada;
}

public void status() {
    System.out.println("Modelo: " + modelo);
    System.out.println("Cor: " + cor);
    System.out.println("Ponta: " + ponta);
    System.out.println("Carga: " + carga);
    System.out.println("Tampada: " + tampada);
}

public void rabiscar() {
    if (tampada == true) {
        System.out.println("ERRO! Não posso rabiscar");
    } else {
        System.out.println("Estou rabiscando");
    }
}

public void tampar() {
    tampada = true;
}

public void destampar () {
    tampada = false;
}
   
   
}
