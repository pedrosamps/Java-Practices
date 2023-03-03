package pessoaVisitanteAlunoBolsista;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + getNome());
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é BOLSITA! Pagamento realizado.");
    }

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
