package funcionarioGerente;

public class Funcionario {
    // Atributos - Variáveis de Instância
    private String nome;
    private float salario;

    //Construtor
    public Funcionario() {}

    //Sobrecarga
    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    //Métodos da classe
    public void aumentarSalario(float perc) {
        this.salario += this.salario * perc/100;
    }

    public String imprimir() {
        return "Funcionário: " + nome + "\nSalário: R$ " + 
        salario;
    }
}
