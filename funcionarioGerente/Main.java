package funcionarioGerente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Funcionario func = new Funcionario("Pedro", 4500);
        Gerente ger = new Gerente(15, "Victória", 4500);

        //Calcula 10% de aumento de Salário para os funcionários
        func.aumentarSalario(10);
        ger.aumentarSalario(10);

        System.out.println("==== DADOS DO FUNCIONÁRIO ===");
        System.out.println(func.imprimir());
        System.out.println("==== DADOS DO FUNCIONÁRIO ====");
        System.out.println(ger.imprimir());
        entrada.close();
    }
}
