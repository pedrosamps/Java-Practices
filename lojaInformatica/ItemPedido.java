package lojaInformatica;

public class ItemPedido {
    // Atributos
    private int numeroItem;
    private String descricaoItem;
    private int totItem;
    private double precoUnitario;

    // Construtor
    public ItemPedido(int numeroItem, String descricaoItem, int totItem, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.totItem = totItem;
        this.precoUnitario = precoUnitario;
    }


    public int getNumeroItem() {
        return numeroItem;
    }
    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }


    public String getDescricaoItem() {
        return descricaoItem;
    }
    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }


    public int getTotItem() {
        return totItem;
    }
    public void setTotItem(int totItem) {
        if (totItem > 0) { 
           this.totItem = totItem; 
        }
        
    }


    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        }
        
    }

    public double getValorTotal() {
        return totItem * precoUnitario;
    }

    public void exibir() {
        System.out.println("Número do item: " + getNumeroItem());
        System.out.println("Descrição do item: " + getDescricaoItem());
        System.out.println("Quantidade comprada: " + getTotItem());
        System.out.println("Preço unitário: R$ " + getPrecoUnitario());
    }
}
