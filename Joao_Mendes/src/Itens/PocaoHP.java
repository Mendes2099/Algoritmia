package Itens;


import java.util.ArrayList;

/**
 * Classe que representa uma poção de cura para o herói.
 */
public class PocaoHP extends ItemHeroi {

    private int curar;

    /**
     * Construtor da classe PocaoHP.
     *
     * @param nome       O nome da poção.
     * @param preco      O preço da poção em GP.
     * @param tiposHeroi Os tipos de herói que podem usar a poção.
     * @param curar      A quantidade de cura proporcionada pela poção.
     */
    public PocaoHP(String nome, int preco, ArrayList<TiposHeroi> tiposHeroi, int curar) {
        super(nome, preco, tiposHeroi);
        this.curar = curar;
    }

    /**
     * Método para mostrar os detalhes da poção.
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco() + " GP");
        System.out.println("Cura: " + getCurar());
    }

    /**
     * Retorna a quantidade de cura proporcionada pela poção.
     *
     * @return A quantidade de cura proporcionada pela poção.
     */
    public int getCurar() {
        return curar;
    }
}
