package contaBanco;

public class Main {
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco(0, null, null, 0, false);
        cliente1.setNumConta(123);
        cliente1.setDono("Pedro");
        cliente1.abrirConta("CC");
        cliente1.depositar(100);
        cliente1.estadoAtual();
        System.out.println("--------------");
        ContaBanco cliente2 = new ContaBanco(0, null, null, 0, false);
        cliente2.setNumConta(321);
        cliente2.setDono("Victória");
        cliente2.abrirConta("CP");
        cliente2.depositar(500);
        cliente2.sacar(1000);
        cliente2.estadoAtual();
    }
}
