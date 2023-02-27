package salarioFuncionario;

public class Main {
    public static void main(String[] args) {
        Salario pessoa = new Salario(0, 0, 0, 0);
        
        System.out.println(pessoa.exibir());
        System.out.println("Salário R$ " + pessoa.calcularSalario());
    }
}
