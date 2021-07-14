public class TesteAtributaveis {

    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(1000.00);

        SeguroDeVida sv = new SeguroDeVida();
        CalculandoImposto cal = new CalculandoImposto();

        cal.registra(cc);
        cal.registra(sv);

        System.out.println("Imposto total: "+ cal.getTotalIposto());
    }

}
