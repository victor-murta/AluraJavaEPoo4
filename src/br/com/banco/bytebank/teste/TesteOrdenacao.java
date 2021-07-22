package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteOrdenacao {

    public static void main(String[] args){

        Conta cc = new ContaCorrente(11, 22);
        cc.deposita(120.00);

        Conta cp = new ContaPoupanca(11, 22);
        cp.deposita(80.00);


        List<Conta> lista = new ArrayList<>();

        lista.add(cp);
        lista.add(cc);

        //TitularDaContaComparator titular = new TitularDaContaComparator();


        // Function objects = funções que encapsulam um obj
        //lista.sort(new NumeroDaContaComparator2());

        // dessa forma ele gera uma classe (classe anônima
        /*lista.sort(new  Comparator<Conta>() {
                @Override
                public int compare(Conta c1, Conta c2){
                    return Integer.compare(c1.getNumero(), c2.getNumero());

                }
            }
        );*/

        lista.sort(( c1, c2) ->  Integer.compare(c1.getNumero(), c2.getNumero()));

        // new Comparator<Conta> = chamando a classe
        // () = chamando o contrutor
        /*Comparator<Conta> comp = new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2){
                String c1Nome = c1.getTitular().getNome();
                String c2Nome = c2.getTitular().getNome();

                return c1Nome.compareTo(c2Nome);
            }
        };*/

        Comparator<Conta> comp = (Conta c1, Conta c2) -> {
            String c1Nome = c1.getTitular().getNome();
            String c2Nome = c2.getTitular().getNome();

            return c1Nome.compareTo(c2Nome);

        };

        /*for(Conta conta : lista){
            System.out.println(conta);
        }*/

        lista.forEach((Conta conta) -> {
                System.out.println(conta + " , " + conta.getTitular().getNome());
            }
        );


    }
}

class NumeroDaContaComparator2 implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2){

        return Integer.compare(c1.getNumero(), c2.getNumero());

    }


}

