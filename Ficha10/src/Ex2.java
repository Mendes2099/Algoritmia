import Classes.Conta;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Instanciar 2 objetoS da classe Classes Conta
        Conta Manolo = new Conta("Manolo", 9999, 4000);
        Conta Tassio = new Conta("Tassio", 8888, 1000);

        //------------------------------------------------------------------------------------------

        System.out.println("");

        Manolo.exibirSaldo();
        Manolo.depositar(1000);
        Manolo.exibirSaldo();

        System.out.println("");


        Manolo.levantar(6000);
        Manolo.exibirSaldo();

        System.out.println("");

        Manolo.transferencia(1000, Tassio);
        Manolo.exibirSaldo();
        Tassio.exibirSaldo();

        System.out.println("");

        Tassio.exibirSaldo();
        Tassio.pedirEmprestimo(900);

        //------------------------------------------------------------------------------------------
    }
}