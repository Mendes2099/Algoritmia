package Ex4;

import java.io.File;

public class FileManager {
    private static FileManager instance;
    private String path;

    private FileManager(String path) {
        this.path = path;
    }

    // Método para obter uma instância única da classe FileManager
    public static synchronized FileManager getInstance(String path) {
        if (instance == null) {
            // Se a instância ainda não existe, cria uma nova
            return instance = new FileManager(path);
        }
        // Retorna a instância existente
        return instance;
    }

    // Método para definir o diretório raiz
    public void setRootDirectory(String path) {
        this.path = path;
    }

    // Método para criar um arquivo
    public void createFile(String nome) {
        new File(nome); // Cria um novo objeto File com o nome especificado, mas não realiza ação alguma com ele
    }

    // Método para excluir um arquivo
    public void deleteFile(String nome) {
        File file = new File(nome); // Cria um objeto File com o nome especificado
        file.delete(); // Exclui o arquivo correspondente ao objeto File
    }
}
