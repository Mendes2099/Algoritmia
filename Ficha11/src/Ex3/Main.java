package src.Ex3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Carro Popo = new Carro("Ford", "Mustang", 2022, 450, 5000, 10.5,TipoCombustivel.GASOLINA);
        Mota Alfreda = new Mota("Honda", "CBR500R", 2021, 47, 471,  4.6);

        //!---------------------------------------------------------------------------------------------------------------------------------------

        Popo.calcularConsumo(10);

        System.out.println("");

        try {
            Alfreda.imagem();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
