package Classes;

public class Retangulo {

    private double altura,largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularPerimetro(){

        double perimetro = (this.altura * 2) + (this.largura * 2);
        return perimetro;

    }

    public double calcularArea(){

        double area =  this.altura*this.largura;
        return area;

    }
}
