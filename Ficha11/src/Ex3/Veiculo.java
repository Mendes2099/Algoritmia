package src.Ex3;

import java.util.Scanner;

public class Veiculo{

    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico,potencia,cilindrada;
    private double consumoL100;
    private int idade;

    //!---------------------------------------------------------------------------------------------------------------------------------------

    // Método construtor
    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, int cilindrada,  double consumoL100) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumoL100 = consumoL100;
    }

    //!---------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Método para calcular a idade em 2023
     * @return Idade em 2023
     */
    public int getIdade(){
        return 2023-anoFabrico;
    }


    /**
     * Método para introduzir um carro com base nos valores introduzidos pelo utilizador
     * @return Carro preenchido
     */
    public static Veiculo introduzirVeiculo(){
        Scanner input = new Scanner(System.in);

        System.out.println("\n***** Novo Veiculo  *****");
        System.out.print("Insira a Marca: ");
        String marca = input.next();

        System.out.print("Insira o Modelo: ");
        String modelo = input.next();

        System.out.print("Insira o Ano de Fabrico: ");
        int ano = input.nextInt();

        System.out.print("Insira a Potência: ");
        int potencia = input.nextInt();

        System.out.print("Insira a Cilindrada: ");
        int cilindrada = input.nextInt();

        System.out.print("Insira o Consumo: ");
        double consumoL100 = input.nextDouble();

        Veiculo veiculoUtilizador = new Veiculo(marca,modelo,ano,potencia,cilindrada,consumoL100);
        return veiculoUtilizador;
    }

    /**
     * Método para imprimir todos os detalhes de um carro
     */
    public void exibirDetalhes(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano Fabrico: "+this.anoFabrico);
        System.out.println("Potência: "+this.potencia+" HP");
        System.out.println("Cilindrada: "+this.marca+" cc");
        System.out.println("Consumo (L/100): "+this.consumoL100);
    }

    /**
     * Método para fazer uma corrida com 2 carros
     * @param adversario Oponente na corrida
     * @return Carro vencedor
     */
    public Veiculo corrida(Veiculo adversario){
        if(this.potencia>adversario.potencia){ //Ganha o Carro por potencia
            return this;
        } else if (adversario.potencia>this.potencia) { // Ganha o adversário por potencia
            return adversario;
        } else { // Empate de potencia
            if(this.cilindrada>adversario.cilindrada){ //Ganha o Carro por cilindrada
                return this;
            } else if (adversario.cilindrada>this.cilindrada) { // Ganha o adversario por cilindrada
                return adversario;
            } else { // Empate de cilindrada
                if(this.anoFabrico>adversario.anoFabrico){ // Ganha o carro por ser mais recente
                    return this;
                } else if (adversario.anoFabrico>this.anoFabrico) { // Ganha o adversario por ser mais recente
                    return adversario;
                }
            }
        }

        return null;
    }

    /**
     * Método que calcula o consumo em Litros de um carro ao longo de uma distância
     * @param distancia - Em km da viagem
     * @return litros consumidos na viagem
     */
    public double calcularConsumo(double distancia){
        return distancia*(this.consumoL100/100);
    }
}
