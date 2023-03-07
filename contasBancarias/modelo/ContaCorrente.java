package contasBancarias.modelo;

public class ContaCorrente extends Conta {
    private static final double TAXA_DEPOSITO = 0.10;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean sacar(double valor) {
        /*  Verifica se o valor do saque é menor/igual ao saldo da conta. Usamos o método getSaldo pois não temos acesso direto ao saldo por ser private */

        if (valor <= getSaldo()) {
            return super.sacar(valor);
        }
        return false; // Quando não existir saldo suficiente
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public String toString() {
        return "ContaCorrente: " + super.toString();
    }

    
}
