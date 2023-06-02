package src.Ex3;

public class Carro extends Veiculo{

    // Atributos de instância
    private TipoCombustivel tipoCombustivel;

    //!---------------------------------------------------------------------------------------------------------------------------------------

    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, double consumoL100, TipoCombustivel tipoCombustivel) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumoL100);
        this.tipoCombustivel = tipoCombustivel;
    }


    //!---------------------------------------------------------------------------------------------------------------------------------------

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double calcularCusto(TipoCombustivel tipoCombustivel, double litros) {

        double consumo;

        if (this.tipoCombustivel.equals(TipoCombustivel.GASOLINA)) {
            consumo = litros * 1.95;
        } else if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)) {
            consumo = litros * 1.75;
        } else {
            consumo = litros * 0.95;
        }

        return consumo;

    }


}
