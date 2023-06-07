package Entidades;

import Itens.PocaoHP;

/**
 * Classe que representa a entidade Cavaleiro.
 */
public class Cavaleiro extends Heroi {

    /**
     * Construtor da classe Cavaleiro.
     *
     * @param nome  O nome do cavaleiro.
     * @param vida  A quantidade de vida do cavaleiro.
     * @param forca A força do cavaleiro.
     * @param nivel O nível do cavaleiro.
     * @param ouro  A quantidade de ouro do cavaleiro. (Também chamado de GP)
     */
    public Cavaleiro(String nome, int vida, int forca, int nivel, int ouro) {
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
                // O herói sofre dano do NPC (80% da força do NPC para simular a armadura do cavaleiro)
                int danoInimigo = (int) (npc.getForca() * 0.8);
                this.subtrairVida(danoInimigo);
                System.out.println("--------------------");
                System.out.println("HP " + this.getNome() + " : " + this.getVida());

                if (this.getVida() > 0) {
                    // Calcula o dano causado pelo herói, considerando sua força e o ataque da arma
                    int danoHeroi = this.getForca() + this.getArma().getAtaque();
                    npc.setVida(npc.getVida() - danoHeroi);
                    System.out.println("HP do " + npc.getNome() + " : " + npc.getVida());

                    // Verifica se o NPC foi derrotado
                    if (npc.getVida() <= 0) {
                        // O herói sobe de nível, aumentando a sua vida, força e GP
                        this.subirNivel();
                        this.incrementarVida(10);
                        this.incrementarForca(1);
                        this.incrementarOuro(10);
                    }
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
     * Método que exibe os detalhes do cavaleiro.
     */
    @Override
    public void mostrarDetalhes() {

        System.out.println("");

        // Imprime os detalhes do cavaleiro
        System.out.println("Stats Cavaleiro:");
        System.out.println("--------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Força: " + getForca());
        System.out.println("Nível: " + getNivel());
        System.out.println("GP: " + getOuro());
        System.out.println("");

        // Imprime os detalhes da arma equipada pelo cavaleiro
        System.out.println("Arma:");
        if (getArma() != null) {
            System.out.println("- " + getArma().getNome());
        } else {
            System.out.println("Nenhuma arma equipada.");
        }

        // Imprime os detalhes das poções de cura do cavaleiro, caso existam
        if (getPocoes().size() > 0) {
            System.out.println("Poções:");
            for (PocaoHP pocao : getPocoes()) {
                System.out.println("- " + pocao.getNome());
                System.out.println("--------------------");
                System.out.println("");
            }
        } else {
            System.out.println("Sem poções!");
            System.out.println("--------------------");
            System.out.println("");
        }
    }
}
