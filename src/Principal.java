
package Atividade;

import java.util.Scanner;


public class Principal {
    
    public static void main(String args[]){
        
        
        Scanner scan = new Scanner(System.in);
        String nomeCliPoup, nomeCliCorre;
        String cpfCliCliPoup, cpfCliCorre;
        int numContaCliPoup, numContaCorre, agenciaCorre, agenciaCliPoup;
        
        ContaPoupanca mostraContaP,menuContaP;

        System.out.print("******Sismte Bancário******\n\n");
        System.out.print("Abertura de contas\n");

        System.out.println("Cadastrando uma conta poupança\n");
        System.out.print("Nome do Cliente: ");
        nomeCliPoup = scan.next();
        System.out.print("CPF do Cliente: ");
        cpfCliCliPoup = scan.next();
        Cliente clienteCP = new Cliente(nomeCliPoup, cpfCliCliPoup);
        System.out.print("Número da conta (somente números): ");
        numContaCliPoup = scan.nextInt();
        System.out.print("Número da agência (somente números): ");
        agenciaCliPoup = scan.nextInt();
        
        ContaPoupanca poupanca = new ContaPoupanca(numContaCliPoup, agenciaCliPoup, clienteCP);
        poupanca.menuContaP(poupanca);
        
        System.out.println("Conta Poupança cadastrada com sucesso!");

        System.out.println("\n---------------------------------------\n");

        System.out.println("Cadastrando uma conta corrente\n");
        System.out.print("Nome do Cliente: ");
        nomeCliCorre = scan.next();
        System.out.print("CPF do Cliente: ");
        cpfCliCorre = scan.next();
        Cliente clienteCorre = new Cliente(nomeCliCorre, cpfCliCorre);
        System.out.print("Número da conta (somente números): ");
        numContaCorre = scan.nextInt();
        System.out.print("Número da agência (somente números): ");
        agenciaCorre = scan.nextInt();
        ContaCorrente corrente = new ContaCorrente(numContaCorre, agenciaCorre, clienteCorre);
        corrente.menuContaC(corrente);
        System.out.println("Conta Corrente cadastrada com sucesso!");

      
        poupanca.mostraContaP(poupanca);
        corrente.mostraContaC(corrente);
    }
}


