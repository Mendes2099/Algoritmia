package TrabalhoPratico.Entidades;

import java.util.ArrayList;
import java.util.Scanner;

import TrabalhoPratico.Itens.Arma;
import TrabalhoPratico.Itens.PocaoHP;

/**
 * Classe abstrata Heroi, que deriva da classe mãe chamada Entidade.
 */
public abstract class Heroi extends Entidade {
    private int nivel;
    private int ouro;
    private Arma arma;
    private ArrayList<PocaoHP> pocoes;

    /**
     * Método construtor da classe Heroi.
     *
     * @param nome  O nome do herói.
     * @param vida  A quantidade de vida do herói.
     * @param forca A força do herói.
     * @param nivel O nível do herói.
     * @param ouro  A quantidade de ouro do herói.
     */
    public Heroi(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.pocoes = new ArrayList<PocaoHP>();
    }

    /**
     * Método para confrontar o NPC.
     *
     * @param npc O NPC a ser confrontado.
     * @return A entidade a ser atacada.
     */
    public abstract Entidade atacar(NPC npc);

    /**
     * Método para adicionar uma poção ao ArrayList de PocaoHP.
     *
     * @param pocao A poção a ser adicionada.
     */
    public void adicionarPocao(PocaoHP pocao) {  // MÉTODO NÃO PEDIDO NO ENUNCIADO
        this.pocoes.add(pocao);
    }

    /**
     * Método para retirar ouro da conta do herói caso ele compre um item.
     *
     * @param quantidade A quantidade de ouro a ser decrementada.
     */
    public void decrementarOuro(int quantidade) {
        ouro -= quantidade;
    }

    /**
     * Método que usa uma poção para se recuperar.
     */
    public void usarPocao() {
        if (this.pocoes.size() > 0) {
            // Declaração da lista de poções disponíveis
            Scanner scanner = new Scanner(System.in);
            int i = 0;
            System.out.print("\n----------------------\n");
            for (PocaoHP pocao : pocoes) {
                System.out.print((++i) + " - " + pocao.getNome() + " (" + pocao.getCurar() + ")\n");
            }
            System.out.print("----------------------\n");

            do {
                System.out.print("");
                System.out.println("Diz-me a poção que queres usar ou zero para não usar nenhuma");
                System.out.print("Resposta: ");
                i = scanner.nextInt();
            } while (i < 0 || i > pocoes.size());

            if (i > 0) {
                i--;
                incrementarVida(pocoes.get(i).getCurar());

                System.out.println("Parabens! Usou a poçao " + pocoes.get(i).getNome() + " e curou " + pocoes.get(i).getCurar());
                pocoes.remove(i);
                System.out.println("A sua vida depois de usar a poção é: " + getVida());
            }
        } else {
            System.out.println("Sem Poção!");
        }
    }

    /**
     * Método que busca uma poção pelo nome.
     *
     * @param nomePocao O nome da poção a ser buscada.
     * @return A poção encontrada ou null se não encontrada.
     */
    private PocaoHP buscarPocaoPorNome(String nomePocao) {
        for (PocaoHP pocao : pocoes) {
            if (pocao.getNome().equals(nomePocao)) {
                return pocao;
            }
        }
        return null;
    }

    /**
     * Método que incrementa a vida do herói.
     *
     * @param quantidade A quantidade a ser incrementada na vida.
     */
    public void incrementarVida(int quantidade) {
        setVida(getVida() + quantidade);
    }

    /**
     * Método que subtrai vida do herói.
     *
     * @param quantidade A quantidade a ser subtraída da vida.
     */
    public void subtrairVida(int quantidade) {  // metodo chamado nos herois em si que recebem danos NPC
        setVida(getVida() - quantidade);
    }

    /**
     * Método que incrementa a força do herói.
     *
     * @param quantidade A quantidade a ser incrementada na força.
     */
    public void incrementarForca(int quantidade) {
        setForca(getForca() + quantidade);
    }

    /**
     * Método que sobe o nível do herói.
     */
    public void subirNivel() {
        nivel++;
    }

    /**
     * Método que incrementa o ouro do herói.
     *
     * @param quantidade A quantidade a ser incrementada no ouro.
     */
    public void incrementarOuro(int quantidade) {
        ouro += quantidade;
    }

    /**
     * Obtém o nível do herói.
     *
     * @return O nível do herói.
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Define o nível do herói.
     *
     * @param nivel O novo nível do herói.
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Obtém a quantidade de ouro do herói.
     *
     * @return A quantidade de ouro do herói.
     */
    public int getOuro() {
        return ouro;
    }

    /**
     * Define a quantidade de ouro do herói.
     *
     * @param ouro A nova quantidade de ouro do herói.
     */
    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    /**
     * Obtém a arma do herói.
     *
     * @return A arma do herói.
     */
    public Arma getArma() {
        return arma;
    }

    /**
     * Define a arma do herói.
     *
     * @param arma A nova arma do herói.
     */
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    /**
     * Obtém a lista de poções do herói.
     *
     * @return A lista de poções do herói.
     */
    public ArrayList<PocaoHP> getPocoes() {
        return pocoes;
    }

    /**
     * Define a lista de poções do herói.
     *
     * @param pocoes A nova lista de poções do herói.
     */
    public void setPocoes(ArrayList<PocaoHP> pocoes) {
        this.pocoes = pocoes;
    }
}