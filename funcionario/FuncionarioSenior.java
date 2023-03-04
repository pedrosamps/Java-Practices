package funcionario;

public class FuncionarioSenior extends Funcionario {
    protected double bonus;

    public FuncionarioSenior(String nome, double horasTrabalhadas, double valorHora, double bonus) {
        super(nome, horasTrabalhadas, valorHora);
        this.bonus = bonus;
    } 
    // SOBREPOSIÇÕES
    public double calcularSalario() {
        return bonus = getHorasTrabalhadas() * (getValorHora() + (getValorHora() * 0.20));
    }

    public String exibir() {
        return super.exibir() + "\n Salário de Funcionário Sênior: R$ " + bonus;
    }

    
}
