package src.Ex3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo {

    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, double consumoL100) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumoL100);
    }

    public void imagem() throws FileNotFoundException {
        File file = new File("C:\\Users\\softdev\\Desktop\\Algo\\Ficha11\\src\\Ex3\\Mota.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}

