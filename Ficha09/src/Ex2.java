import Classes.Cao;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String nome = "Fido";
        String raca = "Pitbull";

        //__________________________________________________________________________________________________________

        // ? Exemplo: 3 formas distintas de instanciar um objeto da classe Cao

        // Número 1 (Simples / Usada para:??)
        Cao Fido = new Cao(nome, raca);


        // Número 2 (Simples / Usada para: quando queremos queremos defenir as variáveis?)
        Cao Spot = new Cao("Spot", "BullDog");


        // Número 3 (Criado por input / Usada para: quando queremos pedir as informações ao utilizador)

        System.out.print("Insira o nome do Cão 3: ");
        String nomeCao = input.next();

        System.out.print("Insira a raça do Cão 3: ");
        String racaCao = input.next();


        // Instanciar um objeto da classe Cao
        Cao caoInputUtilizador = new Cao(nomeCao, racaCao);

        // Imprimir as informações do Cão 3 criado pelo utilizador
        System.out.println("O nome do nome do Cão 3 é " + caoInputUtilizador.getNome());
        System.out.println("A sua raça é " + caoInputUtilizador.getRaca());

        //__________________________________________________________________________________________________________

        // Imprimir as informações do Classes.Cao Fido
        System.out.println("Nome do Classes.Cao: " + Fido.getNome());
        System.out.println("Raca do Classes.Cao: " + Fido.getRaca());

        // Invocar o metodo bark
        System.out.println("Fido diz: ");
        Fido.bark();
        System.out.println("Spot diz: ");
        Spot.bark();
        System.out.println("Cão 3 diz: ");
        caoInputUtilizador.bark();

    }
}
