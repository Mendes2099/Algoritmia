package TrabalhoPratico.Entidades;

/**
 * Classe abstrata que serve como base para outras entidades.
 */
public abstract class Entidade {

    private String nome;
    private int vida;
    private int forca;

    /**
     * Construtor da classe Entidade.
     *
     * @param nome  O nome da entidade.
     * @param vida  A quantidade de vida da entidade.
     * @param forca A força da entidade.
     */

    public Entidade(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    /**
     * Método abstrato para mostrar os detalhes da entidade.
     * Cada classe filha deve implementar esse método de acordo com suas necessidades.
     */
    public abstract void mostrarDetalhes();

    /**
     * Obtém o nome da entidade.
     *
     * @return O nome da entidade.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da entidade.
     *
     * @param nome O novo nome da entidade.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a quantidade de vida da entidade.
     *
     * @return A quantidade de vida da entidade.
     */
    public int getVida() {
        return vida;
    }

    /**
     * Define a quantidade de vida da entidade.
     *
     * @param vida A nova quantidade de vida da entidade.
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Obtém a força da entidade.
     *
     * @return A força da entidade.
     */
    public int getForca() {
        return forca;
    }

    /**
     * Define a força da entidade.
     *
     * @param forca A nova força da entidade.
     */
    public void setForca(int forca) {
        this.forca = forca;
    }
}





