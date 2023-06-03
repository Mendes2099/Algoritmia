package Ex2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("");

        Logger logger = Logger.getInstance("application_log.txt");
        logger.writeToFile("Mensagem de log 1");
        logger.writeToFile("Mensagem de log 2");

        Logger logger1 = Logger.getInstance("srcPorra.txt");
        logger.writeToFile("Porra hahaha");

    }
}
