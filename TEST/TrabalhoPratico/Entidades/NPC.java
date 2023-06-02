package TrabalhoPratico.Entidades;

/**
 * Classe que representa um NPC (Personagem Não-Jogador) no jogo.
 */
public class NPC extends Entidade {

    /**
     * Construtor da classe NPC.
     *
     * @param nome  o nome do NPC
     * @param vida  a vida do NPC
     * @param forca a força do NPC
     */
    public NPC(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    /**
     * Método para mostrar os detalhes do NPC.
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println();
        System.out.println("Detalhes do NPC");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Força: " + getForca());
        System.out.println();
    }

}