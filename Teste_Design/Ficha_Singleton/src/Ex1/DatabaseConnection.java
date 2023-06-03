package Ex1;

public class DatabaseConnection {
    private static DatabaseConnection instance; // Instância única da classe DatabaseConnection
    private String connectionString; // String de conexão com o banco de dados

    private DatabaseConnection(String connectionString) { // Primeiro construtor Private
        this.connectionString = connectionString; // Atribui a connectionString ao atributo da classe
    }

    // Método (getInstance) para obter a instância única da classe DatabaseConnection
    public static synchronized DatabaseConnection getInstance(String connectionString) {
        if (instance == null) { // Verifica se a instância ainda não foi criada
            instance = new DatabaseConnection(connectionString); // Cria uma nova instância usando a connectionString fornecida
        }
        return instance; // Retorna a instância existente ou a nova instância criada
    }

    // Método para estabelecer a conexão com o banco de dados
    public void connect() {
        // Código para conectar à base de dados usando a connectionString
        System.out.println("Conectado à base de dados: " + connectionString);
    }

    // Método para encerrar a conexão com o banco de dados
    public void disconnect() {
        // Código para desconectar da base de dados
        System.out.println("Desconectado da base de dados: " + connectionString);
    }
}
