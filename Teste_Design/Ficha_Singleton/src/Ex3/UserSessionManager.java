package Ex3;

import java.util.Random;

public class UserSessionManager {

    private static UserSessionManager instance;

    private Random token; // Objeto Random para gerar tokens de sessão
    private long lastTime; // Variável para armazenar o último horário de acesso

    private UserSessionManager() {
        this.token = new Random(); // Inicializa o objeto Random
        this.lastTime = System.currentTimeMillis(); // Obtém o horário atual em milissegundos
    }

    // Método para obter uma instância única da classe UserSessionManager
    public static synchronized UserSessionManager getInstance() {
        if (instance == null) {
            // Se a instância ainda não existe, cria uma nova
            return instance = new UserSessionManager();
        }
        // Retorna a instância existente
        return instance;
    }

    // Método para atualizar o último horário de acesso
    public void updateLastAccessTime() {
        this.lastTime = System.currentTimeMillis(); // Atualiza o último horário de acesso para o horário atual
    }

    // Método para obter o token de sessão
    public Random getSessionToken() {
        return token; // Retorna o objeto Random utilizado para gerar tokens de sessão
    }

    // Método para obter o último horário de acesso
    public long getLastAccessTime() {
        return lastTime; // Retorna o último horário de acesso registrado
    }
}

