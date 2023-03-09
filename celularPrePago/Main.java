public class Main {
    public static void main(String[] args) {
        CelularPrePago celular1 = new CelularPrePago("98765430");
        CelularPrePago celular2 = new CelularPrePago("Pedro Sampaio", "879453", 10);

        System.out.println(celular1);
        System.out.println(celular2);

        if (celular2.fazerLigacao()) {
            System.out.println("Ligação realizada.");
        } else {
            System.out.println("Saldo insuficiente para ligação.");
        }

        System.out.println("Novo saldo: R$ " + celular2.getSaldo());
        
        double novoSaldo = celular2.recarregar(10);
        if (novoSaldo > 0) {
            System.out.println("Novo saldo: R$ " + novoSaldo);
        } else {
            System.out.println("Erro na recarga.");
        }

        System.out.println(celular2.toString()); 
    }
}