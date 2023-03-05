package filaPrioridade;

public class Main {
    public static void main(String[] args) {
        FilaDePrioridade fila = new FilaDePrioridade();

        fila.inserir("Pedro", 101, true);
        fila.inserir("Victória", 201, false);
        fila.inserir("Ewok", 202, false);
        fila.inserir("Homero", 102, true);

        while(!fila.estaVazia()) {
            System.out.println(fila.remover().getNome());
        }
    }
}
