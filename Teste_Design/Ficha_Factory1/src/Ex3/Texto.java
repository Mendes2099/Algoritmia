package Ex3;

public class Texto extends Document{
    public Texto(String autor, String nome) {
        super(autor, nome, ".docs");
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento de Texto "+getNome()+getExtensao());
        // Código específico para abrir um documento de texto
    }

    @Override
    public void save() {
        System.out.println("Alterações do autor " +getAutor() + " gravadas.");
        // Código específico para slavar um documento de texto
    }

    @Override
    public void close() {
        System.out.println("A fechar o documento de"+getNome());
        // Código específico para fechar um documento de texto
    }
}
