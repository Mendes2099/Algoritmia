package Ex1;

public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "book":
                return new Book(); // Cria e retorna uma nova instância de Livro
            case "electronics":
                return new Electronics(); // Cria e retorna uma nova instância de Eletrônicos
            case "clothing":
                return new Clothing(); // Cria e retorna uma nova instância de Roupas
            default:
                throw new IllegalArgumentException("Tipo de produto inválido: " + type); // Lança uma exceção para tipos de produtos inválidos
        }
    }
}