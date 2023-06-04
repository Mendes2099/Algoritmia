package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar Variáveis
        String option;

        System.out.println("Escolha o seu taco: (Frango / Carne / Vegetal)");
        option = scanner.next();

        Taco taco1 = TacoFactory.createTaco(option.toUpperCase()); // Cria um objeto usando o input do user usando a fábrica
        taco1.Prepare();
        taco1.Bake();
        taco1.Box();
    }
}
