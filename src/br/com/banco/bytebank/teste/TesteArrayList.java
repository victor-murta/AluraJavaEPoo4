package br.com.banco.bytebank.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;


public class TesteArrayList {
    public static void main(String[] args) {

        //Generics
        //ArrayList<Conta> lista = new ArrayList<Conta>();

        //LinkedList<Conta> lista = new LinkedList<Conta>();

        //List<Conta> lista = new LinkedList<Conta>();

        /*
        List<Conta> lista = new ArrayList<Conta>();


        Conta cc = new ContaCorrente(22, 11);
        System.out.println("Posição 0 " + lista.get(0));
        lista.add(cc);


        Conta cc2 = new ContaCorrente(44, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(45, 22);

        System.out.println("Cc3 é igual a cc2? " + lista.contains(cc2));

        for(Conta conta : lista){
            if(conta.equals(conta)){
                System.out.println("Conta existente");
            }

            System.out.println("Conta inexistente");

        }

        for(Conta conta : lista){
            System.out.println("Numero das contas: " + conta.getNumero());
        }

        */

        /*
        Conta cc1 = new ContaCorrente(11, 22);
        Conta cc2 = new ContaCorrente(33, 44);

        boolean igual = cc1.ehIgual(cc2);
        System.out.println(igual);
        */

        Integer idade = Integer.valueOf("29");
        idade++;
        System.out.println(idade);
        Integer idadeRef = Integer.valueOf(29); //autoboxing => primitivo -> POO

        System.out.println(idadeRef.doubleValue());  //convertendo a idade para double (primitivo)

        int valor = idadeRef.intValue(); // unboxing => Poo -> primitivo  //convertendo a idade para int (primitivo)

        //Number refN = Float.valueOf(29.f);
        //Number refN = Integer.valueOf(29);

        System.out.println(valor);

    }
}
