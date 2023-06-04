package Ex2;

public class TacoFactory {

    public static Taco createTaco(String type) {
        switch (type) {
            case "FRANGO":
                return new TacoFrango(); // Cria e retorna uma nova instância de Taco de Frango
            case "CARNE":
                return new TacoCarne(); // Cria e retorna uma nova instância de Taco de Carne
            case "VEGETAIS":
                return new TacoVeg(); // Cria e retorna uma nova instância de Taco de Vegetais
            default:
                throw new IllegalArgumentException("Tipo de taco inválido: " + type); // Lança uma exceção para tipos de Taco inválidos
        }
    }
}

