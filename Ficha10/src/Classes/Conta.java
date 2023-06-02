package Classes;

public class Conta {

    private String titular;
    private int numeroDaConta, anoAbertura;
    private double saldo, margemEmpréstimo, valorDivida;

    //------------------------------------------------------------------------------------------

    public Conta(String titular, int numeroDaConta, double saldo) {

        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.anoAbertura= 2023;
        this.valorDivida=0;
        this.margemEmpréstimo = saldo*0.9;

    }

    //------------------------------------------------------------------------------------------

    public double getSaldo() {

        return saldo;

    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;

    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = 0;
    }

    //------------------------------------------------------------------------------------------

    public boolean transferencia(double valor, Conta contaDestino) {

        // Verificar se a conta remetente tem saldo suficiente

        if (this.saldo >= valor) {

            // Subtraio ao saldo da conta remetente
            this.saldo -= valor;
            // Incremento ao saldo da conta destino
            contaDestino.saldo += valor;
            // Mensagem de sucesso
            System.out.println("Transferência Concluida para a conta: "+contaDestino.titular);
            return true;

        } else {

            // Mensagem de erro
            System.out.println("Erro ao Transferir");
            return false;

        }
    }

    public boolean depositar(double valor) {

        if (this.saldo <= 0) {

            System.out.println("Erro! Saldo insuficiente!");
            return false;

        } else {

            System.out.println("Deposito Concluido!");
            this.saldo += valor;
            return true;

        }
    }

    public boolean levantar(int valor) {

        if (this.saldo >= valor) {

            System.out.println("Levantamento realizado!");
            this.saldo -= valor;
            return true;

        } else {

            System.out.println("Levantamento realizado! Com divida");
            this.saldo -= valor;
            System.out.println("");
            this.valorDivida += valor;
            return false;

        }

    }


    public void exibirSaldo() {

        System.out.println("Saldo da conta "+this.titular+ " é de: "+ this.saldo);

    }

    //D
    public boolean pedirEmprestimo( double valorPedir) {

        if ( valorPedir <= 0 || valorPedir > this.margemEmpréstimo) {

            System.out.println("Não é possivel requesitar este empréstimo saldo: " + this.saldo);
            return false;
        } else{
            this.saldo += valorPedir;
            System.out.println("Empréstimo realizado com sucesso! Saldo da conta "+this.titular+ " é de: " + this.saldo);
            return true;
        }

    }

}



