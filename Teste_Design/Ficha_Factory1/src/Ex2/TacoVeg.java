package Ex2;

public class TacoVeg extends Taco{

    @Override
    public void Prepare() {
        System.out.println("A preparar taco de vegetais"); // Implementação do método Prepare() para Taco de vegetais
    }
    public void Bake() {
        System.out.println("A cozinhar taco de vegetais"); // Implementação do método Bake() para Taco de vegetais
    }
    public void Box() {
        System.out.println("A embalar taco de vegetais"); // Implementação do método Box() para Taco de vegetais
    }
}

