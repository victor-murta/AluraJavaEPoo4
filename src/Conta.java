//double saldo == atributo

public abstract class Conta {
    // não pode ser lido nem modificado além da classe Conta
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

    public boolean sacar(double valor){
        if ( this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Sacando: " + this.saldo);
            return true;
        }else{
            System.out.println("Salndo insuficiente!");
            return false;
        }
    }

    public boolean transferir( double valor, Conta destino){
        if ( this.sacar(valor)){
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
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
}
