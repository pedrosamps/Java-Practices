package funcionario;

public class Funcionario {
    private String nome;
    private double horasTrabalhadas;
    private double valorHora;

    
    public Funcionario(String nome, double horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }


    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

   public String exibir() {
        return "Funcionário: " + nome + " | Horas Trabalhadas: " + horasTrabalhadas +  " | Valor por hora: R$ " + valorHora + " | Salário: R$ " + calcularSalario();
   }
}
