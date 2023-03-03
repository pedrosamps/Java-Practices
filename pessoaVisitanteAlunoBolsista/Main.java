package pessoaVisitanteAlunoBolsista;

public class Main {
    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(26);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Victória");
        a1.setMatricula(123);
        a1.setCurso("Arquitetura");
        a1.setIdade(26);
        a1.setSexo("Feminino");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setMatricula(321);
        b1.setNome("Ewok");
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}
