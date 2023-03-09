public class CelularPrePago {
    final double taxa_ligacao = 0.75;
    private String cliente; 
    private String telefone;
    private double saldo;

    
    public CelularPrePago(String telefone) {
        setTelefone(telefone);
        this.cliente = "Não registrado!";
    }

    
    public CelularPrePago(String cliente, String telefone, double saldo) {
        this.cliente = cliente;
        setTelefone(telefone);
        if (saldo > 0) {
           this.saldo = saldo; 
        }
    }

 
    public void setTelefone(String telefone) {
        if(telefone != null && telefone.length() > 0) {
            this.telefone = telefone;
        }
    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String nome) {
        this.cliente = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getSaldo() {
        return saldo;
    } 

    public boolean fazerLigacao() {
        if (saldo >= taxa_ligacao) {
            saldo -= taxa_ligacao;
            return true;
        }
        return false;
    }

    public double recarregar(double recarga) {
        if (recarga > 0) {
            saldo += recarga;
            return saldo;
        } 
        return -1;
    }

    @Override
    public String toString() {
        return "CelularPrePago [Cliente: " + cliente + " | Telefone: " + telefone + " | Saldo: R$ " + saldo + "]";
    }
}