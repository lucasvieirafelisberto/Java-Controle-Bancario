package Atividade;

public abstract class Conta {

    protected int numero;
    protected int agencia;
    protected Cliente cliente;
    protected double saldo = 0;

    public Conta(int numero, int agencia, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
    }   

    public double depositar(double valor) {
        this.saldo += valor;
         System.out.println("Desósito de " + valor + " realizado com sucesso!!\n");
        return this.getSaldo();
       
    }

    public double getsaldo() {
        return this.saldo;
    }

     public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        if (numero == 1) {
            return "*********Dados da conta Bancária********* \n\nCliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf() + "\nConta Corrente: " + numero
                    + "\nAgência: " + agencia + "\nSaldo: " + saldo + "\n\n";

        } else {
            return "*********Dados da conta Bancária********* \n\nCliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf() + "\nConta Poupança: " + numero
                    + "\nAgência: " + agencia + "\nSaldo: " + saldo + "\n\n";
        }

    }
    
     public abstract void sacar(double sacarValor);
}
