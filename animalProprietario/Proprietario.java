package animalProprietario;

public class Proprietario {
    private String nome, telefone;

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }


    public String getDados() {
        return "Proprietário (a): " + nome + " | Telefone:" + telefone;
    }


}
