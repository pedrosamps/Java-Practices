package contasBancarias.modelo;

public class ContaPoupanca extends Conta {
    private static double taxa_Saque = 0.01;

    public ContaPoupanca (int numero) {
        super(numero);
    }

    public static void setTaxaSaque(double novaTaxa){
        if (novaTaxa > 0) {
            taxa_Saque = novaTaxa;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor + taxa_Saque <= getSaldo()) {
            return super.sacar(valor + taxa_Saque);
        }
        return false; 
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + super.toString();
    }
}
