package animalHerancaPolimorfismo;
// Classe abstrata que NÃO pode ser instanciada. Somente servir como progenitora.
public abstract class Animal {
    // Atributos de Animal
    protected float peso;
    protected int idade;
    protected int membros;
    // Métodos de Animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    // Métodos Getters e Setters
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
