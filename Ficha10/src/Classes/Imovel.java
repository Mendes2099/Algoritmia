package Classes;

import java.util.ArrayList;

public class Imovel {

    private String rua, cidade;
    private int numeroPorta, numeroQuartos, númeroWc;
    private double area, areaPiscina;
    private TipoImovel tipo;
    private AcabamentoImovel acabamento;

    //------------------------------------------------------------------------------------------

    public Imovel(String rua, String cidade, int numeroPorta, int numeroQuartos, int númeroWc, double area, double areaPiscina, TipoImovel tipo, AcabamentoImovel acabamento) {
        this.rua = rua;
        this.cidade = cidade;
        this.numeroPorta = numeroPorta;
        this.numeroQuartos = numeroQuartos;
        this.númeroWc = númeroWc;
        this.area = area;
        this.areaPiscina = areaPiscina;
        this.tipo = tipo;
        this.acabamento = acabamento;
    }


    //------------------------------------------------------------------------------------------

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public int getNumeroPorta() {
        return numeroPorta;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public int getNúmeroWc() {
        return númeroWc;
    }

    public double getArea() {
        return area;
    }

    public double getAreaPiscina() {
        return areaPiscina;
    }

    public TipoImovel getTipo() {
        return tipo;
    }

    public AcabamentoImovel getAcabamento() {
        return acabamento;
    }

    //------------------------------------------------------------------------------------------

    // A
    public double valor() {

        double valorM2 = 0;

        if (this.tipo.equals(TipoImovel.apartamento)) {
            valorM2 = 1000;
        } else if (this.tipo.equals(TipoImovel.casa)) {
            valorM2 = 3000;
        } else if (this.tipo.equals(TipoImovel.mansão)) {
            valorM2 = 5000;
        }

        if (acabamento.equals(AcabamentoImovel.para_restauro)) {
            valorM2 *= 0.5;
        } else if (acabamento.equals(AcabamentoImovel.usada)) {
            valorM2 *= 0.9;
        } else if (acabamento.equals(AcabamentoImovel.nova_com_alto_acabamento)) {
            valorM2 *= 1.25;
        }

        double valorTotal = area * valorM2;
        valorTotal += numeroQuartos * 7500;
        valorTotal += númeroWc * 10500;
        valorTotal += areaPiscina * 1000;

        return valorTotal;
    }

    // B
    public ArrayList<String> setAcabamento(ArrayList<String> acabamento) {

        acabamento.set(0, "input do utilizador");
        System.out.println("O novo acabamento do estado do imovel é: " + acabamento);
        return acabamento;

    }


    // C
    public void imprimirDescricao() {

        System.out.println("O tipo deste Imóvel é: " + this.tipo);
        System.out.println("O estado deste Imóvel é: " + this.acabamento);

    }

    public Imovel compararImoveis(Imovel outro) {

        if (this.valor() > outro.valor()) {
            System.out.println("A primeira casa é mais cara");
            return this;

        } else {
            System.out.println("A Segunda casa é mais cara");
            return outro;
        }

    }

    //------------------------------------------------------------------------------------------


}
