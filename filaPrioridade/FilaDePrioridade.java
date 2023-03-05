package filaPrioridade;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDePrioridade {
    private Queue<Pessoa> filaNormal;
    private Queue<Pessoa> filaPrioridade;
    private int atendimento;

    //Construtor é um método especial, usado para inicializar o objeto.
    public FilaDePrioridade() {
        filaNormal = new LinkedList<>();
        filaPrioridade = new LinkedList<>();
        atendimento = 0;
    }

    public void inserir(String nome, int senha, boolean prioridade) {
        Pessoa pessoa = new Pessoa(nome, senha);

        if (prioridade) {
            filaPrioridade.add(pessoa);
        } else {
            filaNormal.add(pessoa);
        }
    }
    //Remover uma pessoa normal a cada 2 pessoas na prioridade
    public Pessoa remover() {
        //System.out.println("Atendimento: " + atendimento);

        //Para remover da fila, ela não pode estar vazia (size > 0)
        if (atendimento < 2 && !filaPrioridade.isEmpty()) { // Atendimento de PRIORIDADE
            atendimento++;
            return  filaPrioridade.remove();
            
        } else { // Atendimento normal.
            atendimento = 0;
            return filaNormal.remove();
        }
    }

    //Fila de Prioridade estará vazia, quando as 02 filas estiverem vazias
    public boolean estaVazia() {
        return filaNormal.isEmpty() && filaPrioridade.isEmpty();
    }
}
