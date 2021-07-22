package br.com.banco.bytebank.modelo;

import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.SaldoInsuficienteException;

public abstract class Conta {
    // não pode ser lido nem modificado além da classe br.com.banco.modelo.Conta
    protected double saldo ;
    private int agencia  = 1;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;

    }

    public abstract void deposita(double valor);

    public void sacar(double valor) throws SaldoInsuficienteException {
        if ( this.saldo < valor){
            // erro
            throw new SaldoInsuficienteException("Nome: " + getTitular().getNome() + "Conta: " + getAgencia() + "Saldo: "+this.saldo + ", Valor: " + valor );

        }

        this.saldo -= valor;
    }

    public void transferir( double valor, Conta destino) throws SaldoInsuficienteException {
        this.sacar(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }



    public static int getTotal() {
        return total;
    }

    @Override
    public boolean equals(Object ref){

        Conta outra = (Conta) ref;

        if(outra.agencia != this.agencia && outra.numero != this.numero ){
            return false;
        }else{
            return true;
        }
    }
}
