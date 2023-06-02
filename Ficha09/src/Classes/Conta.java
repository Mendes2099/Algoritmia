package Classes;

public class Conta {

    private String titular;
    private int numeroDaConta;
    private double saldo;

    public Conta(String titular, int numeroDaConta, double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean transferencia(double valor, Conta contaDestino) {

        // Verificar se a conta remetente tem saldo suficiente

        if (this.saldo >= valor) {

            // Subtraio ao saldo da conta remetente
            this.saldo -= valor;
            // Incremento ao saldo da conta destino
            contaDestino.saldo += valor;
            // Mensagem de sucesso
            System.out.println("Transferência Concluida");
            return true;

        } else {

            // Mensagem de erro
            System.out.println("Erro ao Transferir");
            return false;

        }
    }

    /*
    public boolean depositar(double valor

        if (this.saldo <= 0) {

            System.out.println("Erro! Saldo insuficiente!");
            return false;

        } else {

            System.out.println("Deposito Concluido!");
            this.saldo = +valor;
            return true;

        }
    }
    */

    public boolean levantar(int valor) {

        if (this.saldo >= valor) {

            System.out.println("Levantamento realizado!");
            this.saldo -= valor;
            return true;

        } else {

            System.out.println("Erro! Saldo insuficiente!");
            return false;

        }

    }

    public void exibirSaldo() {
        System.out.println("Saldo:" + this.saldo);
    }

}



