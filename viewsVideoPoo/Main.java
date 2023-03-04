package viewsVideoPoo;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula Gama - Bootcamp");
        v[2] = new Video("Apresentação do Bootcamp");

        Expectador g[] = new Expectador[2];
        g[0] = new Expectador("Pedro", 26, "Masculino", 0, null);
        g[1] = new Expectador("Victória", 26, "Feminino", 0, null);

        Visualizacao vis = new Visualizacao(g[0], v[2]);

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        System.out.println(vis.toString());
    }
}
