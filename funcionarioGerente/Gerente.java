package funcionarioGerente;

public class Gerente extends Funcionario {
    private int nFuncionarios;

    //Construtores
    public Gerente() {
        super();
    }

    public Gerente(int nFuncionarios, String nome, float salario) {
        super(nome, salario);
        this.nFuncionarios = nFuncionarios;
    }

    public int getnFuncionarios() {
        return nFuncionarios;
    }
    public void setnFuncionarios(int nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }
    // Reescrita do método aumentarSalario
    @Override
    public void aumentarSalario(float perc) {
        super.aumentarSalario(perc + 20);
    }

    // Reescrita do método imprimir
    @Override
    public String imprimir() {
        return super.imprimir() + " | Número de funcionário que gerencia: " + nFuncionarios +"\n";
    }
}
