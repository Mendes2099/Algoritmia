package Ex2;

public class TacoFrango extends Taco{
    @Override
    public void Prepare() {
        System.out.println("A preparar taco de Frango"); // Implementação do método Prepare() para Taco de Frango
    }
    public void Bake() {
        System.out.println("A cozinhar taco de Frango"); // Implementação do método Bake() para Taco de Frango
    }
    public void Box() {
        System.out.println("A embalar taco de Frango"); // Implementação do método Box() para Taco de Frango
    }
}


