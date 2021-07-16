public class TesteContas {

    public static void main(String[] args) throws SaldoInsuficienteException {


        ContaCorrente cc = new ContaCorrente(114,531);
        cc.deposita(100.00);

        ContaPoupanca cp = new ContaPoupanca(432,754);
        cp.deposita(200.0);

        cc.transferir(10.0, cp);
        System.out.println("Saldo conta poupança: "+cp.getSaldo());
        System.out.println("Saldo conta corrente: "+ cc.getSaldo());

    }
}
