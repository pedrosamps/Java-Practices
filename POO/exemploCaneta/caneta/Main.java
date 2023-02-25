package POO.exemploCaneta.caneta;


// APENAS PRÁTICA PARA MELHOR APRENDIZADO E ENTENDIMENTO
public class Main {
   public static void main(String[] args) {
    Caneta caneta1 = new Caneta(null, null, 0, 0, false);
    caneta1.modelo = "BIC Cristal";
    caneta1.cor = "Azul";
    // caneta1.ponta = 0.5f; // Não funciona pois é um atributo PRIVATE
    caneta1.tampar();
    caneta1.carga = 80; //Funciona pois estou utilizando a classe caneta
    caneta1.tampada = true;
    caneta1.status();
    caneta1.rabiscar();
   } 
}
