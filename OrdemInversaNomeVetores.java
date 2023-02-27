public class OrdemInversaNomeVetores {
    public static void main(String[] args) {
        String nomes [] = new String[7];

        nomes[0] = "Pedro";
        nomes[1] = "Victória";
        nomes[2] = "Ewok";
        nomes[3] = "Homero";
        nomes[4] = "Maristela";
        nomes[5] = "Eliana";
        nomes[6] = "Wilson";

        for (int i = nomes.length - 1; i >= 0 ; i--) {
            System.out.println(nomes[i]);
        }
    }
}
