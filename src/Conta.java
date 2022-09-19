import java.text.DecimalFormat;
public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    Conta(int numero, int agencia){
        total++;
    }
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int novoNumero){
        if(novoNumero > 0) {
            this.numero = novoNumero;
        }else {
           throw new NumeroInvalidoException("Número inválido");
        }
    }
    public int getAgencia(){
        return this.agencia;
    }
    public void setAgencia(int novaAgencia){
        if(novaAgencia > 0){
            this.agencia = novaAgencia;
        }else {
            throw new NumeroInvalidoException("Número inválido");
        }

    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    public static int getTotal(){
        return Conta.total;
    }
}

