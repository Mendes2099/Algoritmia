package src.Ex2;

import java.util.ArrayList;

public class Farm {

    // Declarar o ArrayList com os animais
    ArrayList<Animal> lista_Animais = new ArrayList<>();

    public void addAnimal(Animal animal) {

        lista_Animais.add(animal);

    }

    public void makeNoise() {
        for (Animal animal : lista_Animais) {
            animal.fazerBarulho();
        }
    }
}






