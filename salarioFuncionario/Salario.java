package POO.salarioFuncionario;
import java.util.Scanner;

public class Salario {
    private int funcional;
    private double horasTrabalhadas, valorHora;
    
    public Salario(int funcional, double horasTrabalhadas, double valorHora, double salario) {
        this.funcional = funcional;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public String exibir() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua funcional: ");
        funcional = teclado.nextInt();
        System.out.print("Digite suas horas trabalhadas: ");
        horasTrabalhadas = teclado.nextDouble();
        System.out.print("Digite o valor por hora trabalhada: R$ ");
        valorHora = teclado.nextDouble();
        teclado.close();
        return "Funcional: " + funcional;
    }

    public double calcularSalario () {
        return horasTrabalhadas * valorHora;
    }

}
