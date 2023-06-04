package Ex3;

public class DocumentFactory {
    public static Document createDocument(String type, String nome, String autor) {
        switch (type) {
            case "APRESENTACAO":
                return new Apresentacao(nome, autor);
            case "TEXTO":
                return new Texto(nome, autor);
            case "CALCULO":
                return new Calculo(nome, autor);
            default:
                throw new IllegalArgumentException("Tipo inválido: " + type);
        }
    }
}
