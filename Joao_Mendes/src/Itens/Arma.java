package Itens;

import java.util.ArrayList;

/**
 * Classe que representa uma arma.
 */
public class Arma extends ItemHeroi {
    private int ataque;

    /**
     * Construtor da classe Arma.
     *
     * @param nome       O nome da arma.
     * @param preco      O preço da arma em GP.
     * @param tiposHeroi Os tipos de herói que podem usar a arma.
     * @param ataque     O valor de ataque da arma.
     */
    public Arma(String nome, int preco, ArrayList<TiposHeroi> tiposHeroi, int ataque) {
        super(nome, preco, tiposHeroi);
        this.ataque = ataque;
    }

    /**
     * Retorna o valor de ataque da arma.
     *
     * @return O valor de ataque da arma.
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Define o valor de ataque da arma.
     *
     * @param ataque O valor de ataque da arma.
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Mostra os detalhes da arma, incluindo nome, preço, tipos de herói que podem usá-la e valor de ataque.
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco() + " GP");
        System.out.println("Tipo Heroi: " + getTiposHeroi());
        System.out.println("Ataque: " + getAtaque() + " DMG");
    }
}

