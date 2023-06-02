package src.Ex3;

public class Camiao extends Veiculo{

    private double capacidadeCarga;

    //!---------------------------------------------------------------------------------------------------------------------------------------

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, consumoL100);
        this.capacidadeCarga = capacidadeCarga;
    }

    //!---------------------------------------------------------------------------------------------------------------------------------------

    public boolean viagem(double distancia, double Carga){

        if (Carga <= this.capacidadeCarga) {


            return true;
        } else{

            return false;
        }

    }

}
