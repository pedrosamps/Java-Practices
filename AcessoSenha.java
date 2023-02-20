import java.util.Scanner;

public class AcessoSenha {
    public static void main(String[] args) {
        String senha;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        senha = teclado.nextLine();
        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso NEGADO!!!");
        }
        teclado.close();
    }
}
