package Ex1;

public class Main {
    public static void main(String[] args) {

        System.out.println("");

        DatabaseConnection connection = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydatabase");
        connection.connect();

        DatabaseConnection connection2 = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/second try");
        connection2.connect();
    }
}