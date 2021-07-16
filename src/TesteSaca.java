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
