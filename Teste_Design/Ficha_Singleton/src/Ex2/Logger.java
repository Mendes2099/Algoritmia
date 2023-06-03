package Ex2;

import java.io.*;

public class Logger {

    private static Logger instance; // Única instância da classe Logger
    private File file; // Arquivo onde o log será armazenado


    private Logger(String filename) {
        file = new File(filename); // Cria um objeto File com o nome do arquivo fornecido
    }


    public static synchronized Logger getInstance(String filename) {
        if (instance == null) { // Verifica se a instância ainda não foi criada
            instance = new Logger(filename); // Cria uma nova instância do Logger com o nome do arquivo fornecido
        }
        return instance; // Retorna a instância existente ou a nova instância criada
    }


    public void writeToFile(String content) throws IOException {
        FileWriter writer = new FileWriter(this.file, true); // Cria um FileWriter para o arquivo, com o segundo parâmetro "true" para indicar que a escrita será incremental

        writer.write(content + "\n"); // Escreve o conteúdo no arquivo, adicionando uma quebra de linha

        writer.close(); // Fecha o escritor de arquivo
    }
}
