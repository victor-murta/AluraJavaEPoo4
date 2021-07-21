package br.com.banco.bytebank.modelo;

import br.com.banco.bytebank.modelo.Tributavel;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto(){
        return 42;
    }
}
