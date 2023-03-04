package animalPolimorfismo;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    // Sobrecarga
    public void reagir(String frase) {
        if (frase == "Toma comida" || frase == "Olá") {
            System.out.println("Abanar o rabo e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12 ) {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Ignorar");
        }
    }

    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir (int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar o rabo");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else{ 
                System.out.println("Ignorar");
            }
        }
    }

    public void reagir () {

    }
}
