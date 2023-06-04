package Ex2;

public class TacoCarne extends Taco{
    @Override
    public void Prepare() {
        System.out.println("A preparar taco de Carne"); // Implementação do método Prepare() para Taco de Carne
    }
    public void Bake() {
        System.out.println("A cozinhar taco de Carne"); // Implementação do método Bake() para Taco de Carne
    }
    public void Box() {
        System.out.println("A embalar taco de Carne"); // Implementação do método Box() para Taco de Carne
    }
}
