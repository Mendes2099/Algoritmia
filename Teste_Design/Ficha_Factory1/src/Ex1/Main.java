package Ex1;


public class Main {
    public static void main(String[] args) {

        Product book = ProductFactory.createProduct("book"); // Cria um objeto Livro usando a fábrica
        Product electronics = ProductFactory.createProduct("electronics"); // Cria um objeto Eletrônicos usando a fábrica
        Product clothing = ProductFactory.createProduct("clothing"); // Cria um objeto Roupas usando a fábrica

        book.display(); // Chama o método display() no objeto Livro
        electronics.display(); // Chama o método display() no objeto Eletrônicos
        clothing.display(); // Chama o método display() no objeto Roupas

    }
}
