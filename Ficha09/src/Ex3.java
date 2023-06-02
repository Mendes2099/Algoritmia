import Classes.Cao;
import Classes.Retangulo;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //__________________________________________________________________________________________________________

        // Requisitar informações
        System.out.print("Insira a altura do Retangulo: ");
        double aAltura = input.nextDouble();

        System.out.println("Insira a largura do Retangulo: ");
        double aLargura = input.nextDouble();


        // Instanciar um retangulo
        Retangulo a = new Retangulo(aAltura, aLargura);


        //__________________________________________________________________________________________________________

        // Calculo e impressão das informações do Retangulo criado pelo utilizador

        double perimetro = a.calcularPerimetro();
        double area = a.calcularArea();

        System.out.println("Perimeter: " + perimetro + " m");
        System.out.println("Area: " + area + " m2");

    }
}
