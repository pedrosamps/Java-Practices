package funcionario;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario(null, 0, 0);
        FuncionarioSenior senior = new FuncionarioSenior(null, 0, 0, 0);
        
        System.out.println(" === JUNIOR e PLENO === ");
        func.setNome("Pedro");
        func.setHorasTrabalhadas(100);
        func.setValorHora(5.50);
        System.out.println(func.exibir());
        System.out.println(" === SENIOR === ");
        senior.setNome("Victória");
        senior.setHorasTrabalhadas(100);
        senior.setValorHora(5.50);
        System.out.println(senior.exibir());

    }

 
}
