package lojaInformatica;

public class Main {
    public static void main(String[] args) {
        ItemPedido produto = new ItemPedido(123, "Mouse", 3, 2.50);

        produto.exibir();
        System.out.println("Preço total: R$ " + produto.getValorTotal());
    }
}
