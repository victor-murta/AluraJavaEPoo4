package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {

    public static void main(String[] args){

        Conta cc = new ContaCorrente(11, 22);
        cc.deposita(120.00);

        Conta cp = new ContaPoupanca(11, 22);
        cp.deposita(80.00);


        List<Conta> lista = new ArrayList<>();

        lista.add(cp);
        lista.add(cc);

        //TitularDaContaComparator titular = new TitularDaContaComparator();
        lista.sort(new TitularDaContaComparator());
        /*
        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        lista.sort(comparator);

        */

        for(Conta conta : lista){
            System.out.println(conta);
        }


    }

}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2){

        return Integer.compare(c1.getNumero(), c2.getNumero());

        /*
        if(c1.getNumero() < c2.getNumero()){
            return -1;
        }
        if(c1.getNumero() > c2.getNumero()){
            return 1;
        }
        return 0;

        */
    }


}

class TitularDaContaComparator implements Comparator<Conta>{
    @Override
    public int compare(Conta c1, Conta c2){
        String c1Nome = c1.getTitular().getNome();
        String c2Nome = c2.getTitular().getNome();

        return c1Nome.compareTo(c2Nome);
    }
}