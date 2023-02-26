package placar;

public class Main {
    public static void main(String[] args) {
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("ABC FC", "América");
        Placar placar3 = new Placar("ABC FC", "América", 5, 2); 
        

       System.out.println(placar1.exibir()); 
       System.out.println(placar2.exibir());
       System.out.println(placar3.exibir());
    }
}
