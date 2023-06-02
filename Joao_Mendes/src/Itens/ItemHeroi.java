package Itens;

import java.util.ArrayList;

/**
 * Classe abstrata que representa um item do herói.
 */
public abstract class ItemHeroi {
    private String nome;
    private int preco;
    private ArrayList<TiposHeroi> tiposHeroi;

    /**
     * Construtor da classe ItemHeroi.
     *
     * @param nome       O nome do item.
     * @param preco      O preço do item em GP.
     * @param tiposHeroi Os tipos de herói que podem usar o item.
     */
    public ItemHeroi(String nome, int preco, ArrayList<TiposHeroi> tiposHeroi) {
        this.nome = nome;
        this.preco = preco;
        this.tiposHeroi = tiposHeroi;
    }

    /**
     * Método abstrato para mostrar os detalhes do item.
     */
    public abstract void mostrarDetalhes();

    /**
     * Retorna o nome do item.
     *
     * @return O nome do item.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do item.
     *
     * @param nome O nome do item.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o preço do item em GP.
     *
     * @return O preço do item em GP.
     */
    public int getPreco() {
        return preco;
    }

    /**
     * Define o preço do item em GP.
     *
     * @param preco O preço do item em GP.
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }

    /**
     * Retorna os tipos de herói que podem usar o item.
     *
     * @return Os tipos de herói que podem usar o item.
     */
    public ArrayList<TiposHeroi> getTiposHeroi() {
        return tiposHeroi;
    }

}