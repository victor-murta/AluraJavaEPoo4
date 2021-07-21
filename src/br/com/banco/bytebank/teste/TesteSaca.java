package br.com.banco.teste;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);

        try{
            conta.sacar(900.0);
        }catch(SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());
        }


        System.out.println(conta.getSaldo());
    }


}
