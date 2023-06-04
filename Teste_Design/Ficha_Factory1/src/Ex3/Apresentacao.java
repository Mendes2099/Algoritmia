package Ex3;

public class Apresentacao extends Document{

        public Apresentacao(String autor, String nome) {
            super(autor, nome, ".pptx");
        }

        @Override
        public void open() {
            System.out.println("A abrir o documento de apresentacao "+getNome()+getExtensao());
            // Código específico para abrir um documento de apresentacao
        }

        @Override
        public void save() {
            System.out.println("Alterações do autor " +getAutor() + " gravadas.");
            // Código específico para slavar um documento de apresentacao
        }

        @Override
        public void close() {
            System.out.println("A fechar o documento de"+getNome());
            // Código específico para fechar um documento de apresentacao
        }
    }

