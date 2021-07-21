package br.com.banco.bytebank.modelo;



public class CalculandoImposto {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();

        this.totalImposto += valor;

    }

    public double getTotalIposto(){
        return this.totalImposto;
    }
}
