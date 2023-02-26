package contaBanco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono, double saldo, boolean status) {
        this.saldo = 0;
        this.status = false; 
    }


    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int num) {
        this.numConta = num;
    }



    public String getTipo() {
        return tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }



    public String getDono() {
        return dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }



    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double s) {
        this.saldo = s;
    }



    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean s) {
        status = s;
    }



    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            setSaldo(50);
        } else {
            if (t == "CP") {
                this.setSaldo(150);
            }
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro! Não pode ser fechada.");
        } else {
            if (this.getSaldo() < 0) {
                System.out.println("Conta em débito! Não pode ser fechada.");
            } else {
                setStatus(false);
                System.out.println("Conta FECHADA com sucesso!");
            }
        } 
    }
    
    public void depositar(double valor) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Conta fechada. Impossível depositar!");
        }
    }

    public void sacar(double valor) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta fechado. Impossível sacar!");
        }
    }

    public void pagarMensal() {
        int valor = 0;
        if (this.getTipo() == "CC") {
            valor = 12;
        } else {
            if (this.getTipo() == "CP") {
                valor = 20;
            }
        }
        if (this.getStatus() == true) {
            if (saldo > valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Pagamento realizado na conta de " + getDono());
            } else {
                System.out.println("Saldo INSUFICIENTE!");
            }
        }
    }

    public void estadoAtual() {
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }
}
