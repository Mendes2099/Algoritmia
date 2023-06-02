package Classes;

import java.util.ArrayList;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private ArrayList<String> alimentacao;

    //------------------------------------------------------------------------------------------

    public Animal(String nome, String especie, String paisOrigem, double peso, ArrayList<String> alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    //------------------------------------------------------------------------------------------

    public void comer(String alimento, double pesoRefeicao) {

        boolean comeu = false;

        for (String alimentoDado : alimentacao) {
            // loop iterates over each element "alimentoDado" in the alimentacao array.

            if (alimentoDado.equals(alimento)) { // Checks if the current "alimentoDado" is equal to the "alimento" received as a parameter.

                comeu = true;
                this.peso += (pesoRefeicao);
                // Increments the animal's weight with the weight of the meal, converted from grams to kilograms.
                System.out.println(this.nome + " comeu!");
                // Prints a message indicating that the animal ate the food.
                break;
                // Stops the loop, since the food has been found and the animal has already eaten.

            }
        }

        if (comeu==false) {

            System.out.println(this.nome + " recusou o alimento dado!");

        }
    }

    //------------------------------------------------------------------------------------------

    public double getPeso() {

        return peso;

    }

    public void setPeso(double peso) {

        this.peso = peso;

    }

    public String getNome() {
        return nome;
    }
}

