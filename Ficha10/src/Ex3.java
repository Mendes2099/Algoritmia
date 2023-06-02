import Classes.Animal;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<String> alimentacao = new ArrayList<String>();
        alimentacao.add(0,"Frango");
        alimentacao.add("Ração");
        alimentacao.add("Carne");


        // Instanciar 1 Objeto da classe Animal
        Animal Yummi = new Animal("Yummi", "gato", "Portugal", 4000, alimentacao );

        //------------------------------------------------------------------------------------------

        System.out.println("");

        Yummi.comer("Couves",2500);
        System.out.println("Depois da tentativa de alimentação "+ Yummi.getNome()+  " tem: " +Yummi.getPeso()+ " gr");

        System.out.println("");

        Yummi.comer("Frango",5000);
        System.out.println("Depois da tentativa de alimentação " +Yummi.getNome() +  " tem: " +Yummi.getPeso()+ " gr");

        //------------------------------------------------------------------------------------------
    }
}
