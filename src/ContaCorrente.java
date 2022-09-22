package Atividade;

import java.util.Scanner;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, int agencia, Cliente cliente) {
        super(numero, agencia, cliente);
    }

    public void sacar(double valorSaque) {
        if (this.saldo == 0) {
            System.out.println("Saldo insuficiente");
        } else if (valorSaque > saldo) {
            System.out.println("Saldo Insulficiente\nOperação não permitida.");
        } else {
            this.saldo -= valorSaque;
            
        }
    }

    public void menuContaC(ContaCorrente ContaC) {
        try (Scanner teclado = new Scanner(System.in)) {
			int opcao;
			System.out.println("Saldo Atual da conta é de: " + this.getSaldo() + "\n");
			System.out.println("Escolha uma operação");
			System.out.println("1-Deposito\n2-Saque\n3-Sair");
			opcao = teclado.nextInt();

			if (opcao == 1) {
			    double depoisto;
			    System.out.print("Qual o valor do depósito: ");
			    depoisto = teclado.nextDouble();
			    ContaC.depositar(depoisto);
			    ContaC.menuContaC(ContaC);
			} else if (opcao == 2) {
			    double saque = 0;
			    double saqueTaxa = 0.1;
			    System.out.print("Qual o valor do saque: ");
			    saque = teclado.nextDouble();
			    if (saque > ContaC.getSaldo()) {
			        System.out.println("Você não possui saldo suficiente para essa operação\n");
			        ContaC.menuContaC(ContaC);
			    } else if (saque > ContaC.getSaldo()) {
			        System.out.println("Você não possui saldo suficiente para essa operação\n");
			        ContaC.menuContaC(ContaC);
			    } else if (saque < ContaC.getSaldo()) {
			        ContaC.sacar(saque - saqueTaxa);
			        System.out.println("Operação realizada com sucesso!\n");
			        ContaC.menuContaC(ContaC);
			    } else if (opcao == 3) {
			        System.out.println("Finalizando operações!!!");
			    } else {
			        System.out.println("Você não pode efetuar um saque nesse valor!");
			        ContaC.menuContaC(ContaC);
			    }
			}
		}
    }

    public void mostraContaC(ContaCorrente ContaC) {
        System.out.println("\n---------------------------------*\n");
        System.out.println("Nome do cliente: " + this.getCliente().getNome());
        System.out.println("CPF do cliente: " + this.getCliente().getCpf());
        System.out.println("Numero Conta: " + this.getNumero());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Saldo:R$" + this.getSaldo());
    }
}
