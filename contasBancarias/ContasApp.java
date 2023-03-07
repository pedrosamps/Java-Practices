package contasBancarias;

import java.util.ArrayList;
import java.util.Scanner;

import contasBancarias.modelo.Conta;
import contasBancarias.modelo.ContaCorrente;
import contasBancarias.modelo.ContaEspecial;
import contasBancarias.modelo.ContaPoupanca;

public class ContasApp {
    public static void main(String[] args) {
        ArrayList<Conta> listaDeContas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        int numeroConta;
        double limite, valor;

        while (opcao != 7) {
            System.out.println("1 - Nova Conta CORRENTE");
            System.out.println("2 - Nova Conta POUPANÇA");
            System.out.println("3 - Nova Conta ESPECIAL");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Depositar");
            System.out.println("6 - Sacar");
            System.out.println("7 - Sair");
            System.out.println("--> ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    ContaCorrente cc = new ContaCorrente(numeroConta);
                    listaDeContas.add(cc);
                    break;
                case 2:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    ContaPoupanca cp = new ContaPoupanca(numeroConta);
                    listaDeContas.add(cp);
                    break;
                case 3:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do limite: R$ ");
                    limite = teclado.nextDouble();
                    listaDeContas.add(new ContaEspecial(numeroConta, limite));
                    break;
                case 4:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    // Para cada conta da ListadeContas
                    for (Conta conta : listaDeContas) {
                        //Verifica o número da conta existente
                        if (conta.getNumero() == numeroConta) {
                            System.out.println(conta);
                            break; // Interrompe o for.
                        }
                    }
                    break;
                case 5:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Valor do depósito: R$ ");
                    valor = teclado.nextDouble();
                    for (Conta conta : listaDeContas) {
                        if (conta.getNumero() == numeroConta) {
                            //Tenta fazer o depósito
                           if (conta.depositar(valor)) {
                            System.out.println("Depósito realizado!");
                            System.out.println(conta);
                           } else {
                            System.out.println("Falha ao depositar.");
                           }
                           break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Valor do saque: R$ ");
                    valor = teclado.nextDouble();
                    for (Conta conta : listaDeContas) {
                        if (conta.sacar(valor)) {
                            System.out.println("Saque realizado!");
                            System.out.println(conta);
                        } else {
                            System.out.println("Falha ao sacar");
                        }
                        break;
                    }
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        teclado.close();
    }
}
