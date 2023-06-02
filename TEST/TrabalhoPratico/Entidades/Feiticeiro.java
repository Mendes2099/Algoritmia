package TrabalhoPratico.Entidades;

import TrabalhoPratico.Itens.PocaoHP;

/**
 * Classe que representa a entidade Feiticeiro.
 */
public class Feiticeiro extends Heroi {

    /**
     * Construtor da classe Feiticeiro.
     *
     * @param nome  O nome do feiticeiro.
     * @param vida  A quantidade de vida do feiticeiro.
     * @param forca A força do feiticeiro.
     * @param nivel O nível do feiticeiro.
     * @param ouro  A quantidade de ouro do feiticeiro.
     */
    public Feiticeiro(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca, nivel, ouro);
    }

    /**
     * Método que representa a ação de atacar um NPC.
     *
     * @param npc O NPC a ser atacado.
     * @return A entidade derrotada (o herói ou o NPC).
     */
    @Override
    public Entidade atacar(NPC npc) {

        System.out.println("★★★★★-" + this.getNome() + " VS " + npc.getNome() + "-★★★★★");
        boolean existeArma = true;

        // Verifica se o herói possui uma arma equipada
        if (this.getArma() == null) {
            existeArma = false;
        }

        // Verifica se o herói possui uma arma
        if (existeArma == true) {
            // O combate continua enquanto o herói e o NPC tiverem vida
            while (this.getVida() > 0 && npc.getVida() > 0) {
                // Calcula o dano causado pelo herói, considerando a sua força e o ataque da arma
                int danoHeroi = this.getForca() + this.getArma().getAtaque();
                npc.setVida(npc.getVida() - danoHeroi);
                System.out.println("--------------------");
                System.out.println(npc.getNome() + " : " + npc.getVida());

                // Verifica se o NPC foi derrotado
                if (npc.getVida() <= 0) {
                    // O herói sobe de nível, aumentando a sua vida, força e GP
                    this.subirNivel();
                    this.incrementarVida(10);
                    this.incrementarForca(1);
                    this.incrementarOuro(10);
                } else {
                    // O herói sofre dano do NPC (força do NPC)
                    int danoInimigo = (int) (npc.getForca());
                    this.subtrairVida(danoInimigo);
                    System.out.println("A tua vida: " + this.getVida());
                }
            }
        }

        // Verifica o resultado do combate
        if (npc.getVida() <= 0 && existeArma == true) {

            System.out.println("");
            System.out.println("--------------------");
            System.out.println("O herói venceu!");
            System.out.println("--------------------");
            return this;
        } else {

            System.out.println("");
            System.out.println("--------------------");
            System.out.println("O herói foi derrotado.");
            System.out.println("--------------------");
            return npc;
        }
    }

    /**
     * Método que exibe os detalhes do feiticeiro.
     */
    @Override
    public void mostrarDetalhes() {

        System.out.println("");

        // Imprime os detalhes do feiticeiro
        System.out.println("Stats Feiticeiro:");
        System.out.println("--------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Força: " + getForca());
        System.out.println("Nível: " + getNivel());
        System.out.println("GP: " + getOuro());
        System.out.println("--------------------");

        // Imprime os detalhes da arma equipada pelo feiticeiro
        System.out.println("Arma:");
        if (getArma() != null) {
            System.out.println("- " + getArma().getNome());
        } else {
            System.out.println("Nenhuma arma equipada.");
        }

        // Imprime os detalhes das poções de cura do feiticeiro, caso existam
        if (getPocoes().size() > 0) {
            System.out.println("Poções:");
            for (PocaoHP pocao : getPocoes()) {
                System.out.println("- " + pocao.getNome());
            }
        } else {
            System.out.println("Sem poções!");
        }
    }
}