package Entidades;

import Itens.Arma;
import Itens.ItemHeroi;
import Itens.PocaoHP;
import Itens.TiposHeroi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que representa um vendedor.
 */
public class Vendedor {

    private ArrayList<ItemHeroi> inventario;

    /**
     * Construtor da classe Vendedor.
     * Inicializa o inventário como um ArrayList vazio.
     */
    public Vendedor() {
        this.inventario = new ArrayList<>();
    }

    /**
     * Adiciona um item ao inventário do vendedor.
     *
     * @param item O item a ser adicionado.
     */
    public void adicionarItem(ItemHeroi item) {
        inventario.add(item);
    }

    /**
     * Imprime o inventário do vendedor, mostrando os detalhes de cada item.
     */
    public void imprimirInventario() {

        System.out.println("Inventário do Vendedor:\n");
        int contador = 1;

        // Percorre o inventário do vendedor com for each, imprimindo assim os detalhes de cada item
        for (ItemHeroi item : inventario) {
            System.out.println("Item " + contador);
            item.mostrarDetalhes();
            System.out.println("--------------------");
            contador++;
        }
    }

    /**
     * Retorna o inventário do vendedor.
     *
     * @return O inventário do vendedor.
     */
    public ArrayList<ItemHeroi> getInventario() {
        return inventario;
    }

    /**
     * Define o inventário do vendedor.
     *
     * @param inventario O inventário do vendedor.
     */
    public void setInventario(ArrayList<ItemHeroi> inventario) {
        this.inventario = inventario;
    }

    /**
     * Realiza a venda de itens para um herói.
     *
     * @param heroi O herói que ira realizar a compra.
     */
    public void vender(Heroi heroi) {

        // Variável para controlar se a venda será continuada ou não
        boolean continuarCompra = true;
        // Array List para armazenar os itens comprados pelo herói
        ArrayList<ItemHeroi> itensComprados = new ArrayList<>();

        // Loop que continua enquanto a compra decorrer
        while (continuarCompra) {

            // Solicita ao user que escolha um item para comprar ou siga em frente
            System.out.print("Escreve o número do item que deseja ou zero para seguir em frente: ");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();

            if (index == 0) {
                // Caso o user escolha zero, indica que ele decidiu seguir em frente e encerra a venda
                System.out.println("--------------------");
                System.out.println("Segues em frente..");
                System.out.println("--------------------");
                continuarCompra = false;
            } else if (index >= 1 && index <= inventario.size()) {
                // Caso o user escolha um índice válido do inventário
                ItemHeroi item = inventario.get(index - 1);

                if (!itensComprados.contains(item)) {
                    // Verifica se o item ainda não foi comprado
                    boolean permitido = false;

                    // Verifica se o herói é permitido a usar o item com base nos tipos de herói permitidos pelo item
                    for (TiposHeroi heroiPermitido : item.getTiposHeroi()) {
                        if (heroiPermitido.toString().equals(heroi.getClass().getSimpleName().toUpperCase())) {
                            permitido = true;
                            break;
                        }
                    }

                    if (permitido) {
                        // Verifica se o herói possui GP's suficientes para comprar o item
                        if (heroi.getOuro() >= item.getPreco()) {
                            // Realiza a compra
                            if (item instanceof Arma) {
                                Arma arma = (Arma) item;
                                heroi.setArma(arma);
                            } else if (item instanceof PocaoHP) {
                                PocaoHP pocao = (PocaoHP) item;
                                heroi.adicionarPocao(pocao);
                            }

                            heroi.decrementarOuro(item.getPreco());
                            itensComprados.add(item);
                            inventario.remove(item);
                            System.out.println("--------------------");
                            System.out.println("★★★★★-Comprou o item: " + item.getNome() + " -★★★★★");
                            System.out.println("Valor: " + item.getPreco() + " GP");
                            System.out.println("");
                            System.out.println("GP restante: " + heroi.getOuro());
                            System.out.println("");
                            System.out.println("--------------------");
                            imprimirInventario();
                        } else {
                            // Caso o herói não tenha GP's suficientes para comprar o item
                            System.out.println("--------------------");
                            System.out.println("Ora amigo, pareces um pouco liso.. (Não tens GP suficiente para comprar este item)");
                            System.out.println("--------------------");
                        }
                    } else {
                        System.out.println("");
                        System.out.println("--------------------");
                        System.out.println("O vendedor encontra um item estranho.. Não o reconheces, e tampouco o consegues manusear..");
                        System.out.println("--------------------");
                    }
                    System.out.print("");
                    heroi.mostrarDetalhes();
                    System.out.print("");
                } else {
                    System.out.println("--------------------");
                    System.out.println("Esse item já foi comprado. Escolha outro item.");
                    System.out.println("--------------------");
                }
            } else {
                System.out.println("--------------------");
                System.out.println("Índice inválido. Por favor, escolha um índice válido.");
                System.out.println("--------------------");
            }
        }
    }

}






