package src.Ex2;

public class Main {

    public static void main(String[] args) {

        // Instancia da Farm. e de 5 animais

        Farm Farm1 = new Farm();

        Galinha Bernardo = new Galinha();
        Galinha Ignacio = new Galinha();
        Porco Antonio = new Porco();
        Gato Kika = new Gato();
        Vaca Leiteira = new Vaca();


        Farm1.addAnimal(Bernardo);
        Farm1.addAnimal(Kika);
        Farm1.addAnimal(Leiteira);
        Farm1.addAnimal(Leiteira);
        Farm1.addAnimal(Ignacio);

        System.out.println("---------");

        Farm1.makeNoise();

        System.out.println("---------");

    }

}
