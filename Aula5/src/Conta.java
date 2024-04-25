public class Conta {
    int numero;
    float saldo;
    String cliente;


    public Conta(String cliente, int numero) {
        this(cliente, numero, 0.0f);
    }

    public Conta(String cliente, int numero, float saldo) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;
    }




    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public boolean saca(float valor) {
        if(this.saldo < valor) {
            return false;
        }
        if(valor <= 0) {
            return false;
        }
        saldo-= valor;
        return true;
    }

    public boolean deposita(double valor) {
        if(valor <= 0) {
            return false;
        }

        this.saldo+= valor;

        return true;
    }

    public boolean transfere(Conta conta, double valor) {
        if(this.saldo < valor) {
            return false;
        }

        conta.deposita(valor);
        this.saldo-= valor;

        return true;
    }



}