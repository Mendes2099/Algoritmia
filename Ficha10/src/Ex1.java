import Classes.Carro;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Instanciar um objeto da classe Carro através de input - Parte 1
        System.out.print("Insira a marca do carro: ");
        String marcaCarro = input.next();

        System.out.print("Insira o modelo do carro: ");
        String modeloCarro = input.next();

        System.out.print("Insira o ano do carro: ");
        int anoCarro = input.nextInt();

        /*
        System.out.print("Insira o tipo de combustível do carro (GASOLINA, DIESEL ou GPL): ");
        Classes.TipoCombustivel tipoCombustivel = Classes.TipoCombustivel.valueOf(input.next().toUpperCase());
*/
        System.out.print("Insira a potência do carro: ");
        double potencia = input.nextDouble();

        System.out.print("Insira a cilindrada do carro: ");
        double cilindrada = input.nextDouble();

        System.out.print("Insira o consumo do carro: ");
        double litros100Km = input.nextDouble();
/*
        // Instanciar um objeto da classe Carro através de input - Parte 2
        Carro carroUtilizador = new Carro(marcaCarro, modeloCarro, anoCarro, tipoCombustivel, potencia, cilindrada, litros100Km);
*/

        //!__________________________________________________________________________________________________________

/*
        // Chamada da função ligar ()
        carroUtilizador.ligar();

 */

    }
}