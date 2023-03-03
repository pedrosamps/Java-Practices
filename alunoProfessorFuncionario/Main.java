package alunoProfessorFuncionario;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Victória");
        p3.setNome("Ewok");
        p4.setNome("Lupin");

        p1.setSexo("Masculino");
        p2.setSexo("Feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Masculino");

        p2.setCurso("Arquitetura");
        p3.setSalario(4500);
        p4.setSetor("Vistoria");

        p3.receberAumento(550);
        

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
