package Atividade;

import java.util.Scanner;

public class ContaPoupanca  extends Conta{

    public ContaPoupanca(int numero, int agencia, Cliente cliente) {
        super(numero, agencia, cliente);
    }
    
    @Override
    public void sacar(double valorSaque) {
        if (this.saldo == 0) {
            System.out.println("Saldo insuficiente");
        } else if (valorSaque > saldo) {
            System.out.println("Saldo Insulficiente\nOperação não permitida.");
        } else {
            this.saldo -= valorSaque;
            System.out.println("Operação realizada com sucesso!!");
        }
    }
    public void menuContaP(ContaPoupanca ContaP) {
       
        
        Scanner teclado = new Scanner(System.in);
        
        int opcao;
        double depoisto;
        double saque = 0;
        
        System.out.println("Saldo Atual da conta é de: " + this.getSaldo() + "\n");
        System.out.println("Escolha uma operação");
        System.out.println("1-Depósito\n2-Saque\n3-Sair");
        opcao = teclado.nextInt();
        System.out.print("Opção: ");
        
        switch(opcao) {
        case 1:
        	System.out.println("Informe o valor do depósito");
            depoisto = teclado.nextDouble();
            ContaP.depositar(depoisto);
            ContaP.menuContaP(ContaP);
            break;
        case 2:
        	System.out.println("Informe o valor do saque");
        	 saque = teclado.nextDouble();
             if (saque > ContaP.getSaldo()) {
                 System.out.println("Você não possui saldo suficiente para essa operação\n");
                 ContaP.menuContaP(ContaP);
             } else if (saque > ContaP.getSaldo()) {
                 System.out.println("Você não possui saldo suficiente para essa operação\n");
                 ContaP.menuContaP(ContaP);
             } else if (saque < ContaP.getSaldo()) {
                 ContaP.sacar(saque);
                 System.out.println("Operação realizada com sucesso!\n");
                 ContaP.menuContaP(ContaP);
             } else if (opcao == 3) {
                 System.out.println("Finalizando operações!!!");
                 ContaP.menuContaP(ContaP);
             } else {
                 System.out.println("Você não pode efetuar um saque nesse valor!");
                 ContaP.menuContaP(ContaP);
             }
        case 3:
        	
        	break;
        	default:
        		System.out.println("Opção inválida");
        		 ContaP.menuContaP(ContaP);
        		
          
        }
    }

    public void mostraContaP(ContaPoupanca ContaP) {
        System.out.println("\n---------------------------------*\n");
        System.out.println("Nome do cliente: " + this.getCliente().getNome());
        System.out.println("CPF do cliente: " + this.getCliente().getCpf());
        System.out.println("Numero Conta: " + this.getNumero());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Saldo:R$" + this.getSaldo());
    }
} 
