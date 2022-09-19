public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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
        this.numero = novoNumero;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public void setAgencia(int novaAgencia){
        this.agencia = novaAgencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}

