package animalProprietario;

public class Animal {
    private String nome, raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nomeAnimal, String raca, int anoNascimento, String nomeProprietario, String telefone) {
        this.nome = nomeAnimal;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        proprietario = new Proprietario(nomeProprietario, telefone);
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public String getDados() {
        return "Animal: " + nome + " | Raça: " + raca + " | Nascimento: " + anoNascimento + "\n" + proprietario.getDados();
    }
}
