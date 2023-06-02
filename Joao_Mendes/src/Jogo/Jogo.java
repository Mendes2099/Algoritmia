package Jogo;

import Entidades.*;
import Itens.Arma;
import Itens.PocaoHP;
import Itens.TiposHeroi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal que contém o método main para executar o jogo.
 */
public class Jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean venceu;
        String resposta = "";

        do {
            int heroiEscolhido;
            Heroi heroi = null;
            boolean opcaoValida = false;

            // Loop para solicitar ao user que selecione a classe do herói
            while (!opcaoValida) {
                System.out.println("");
                System.out.println("★★★★★-Dungeons & Coders-★★★★★");
                System.out.println("");
                System.out.println("⦾ Menu de selecção de Classe");
                System.out.println("1. Cavaleiro");
                System.out.println("2. Feiticeiro");
                System.out.println("3. Arqueiro");
                System.out.print("Seleciona a tua classe: ");

                try {
                    String input = scanner.nextLine();
                    heroiEscolhido = Integer.parseInt(input);

                    switch (heroiEscolhido) {
                        case 1:
                            heroi = criarCavaleiro();
                            opcaoValida = true;
                            break;
                        case 2:
                            heroi = criarFeiticeiro();
                            opcaoValida = true;
                            break;
                        case 3:
                            heroi = criarArqueiro();
                            opcaoValida = true;
                            break;
                        default:
                            System.out.println("");
                            System.out.println("---------------------------------");
                            System.out.println("Opção inválida. Insire um número de 1 a 3.");
                            System.out.println("---------------------------------");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("");
                    System.out.println("---------------------------------");
                    System.out.println("Erro! Insire um número de 1 a 3");
                    System.out.println("---------------------------------");
                }
            }

            opcaoValida = false;
            int dificuldade = 0;

            // Loop para solicitar ao jogador que selecione a dificuldade
            while (!opcaoValida) {
                try {
                    System.out.println("");
                    System.out.println("---------------------------------");
                    System.out.println("⦾ Menu de selecção da dificuldade");
                    System.out.println("1. Fácil");
                    System.out.println("2. Difícil");
                    System.out.print("Seleciona a dificuldade: ");

                    String input = scanner.nextLine();
                    dificuldade = Integer.parseInt(input);

                    if (dificuldade == 1 || dificuldade == 2) {
                        opcaoValida = true;
                    } else {
                        System.out.println("");
                        System.out.println("---------------------------------");
                        System.out.println("Opção inválida. Insire um número de 1 a 3.");
                        System.out.println("---------------------------------");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("");
                    System.out.println("---------------------------------");
                    System.out.println("Erro! Insire o número 1 ou 2");
                    System.out.println("---------------------------------");
                }
            }

            // Definição dos Skill Points
            int pontosCriacao;
            int pontosVida;
            int pontosForca = 0;

            do {
                if (dificuldade == 1) {
                    pontosCriacao = 300;
                    System.out.println("");
                    System.out.println("---------------------------------");
                    System.out.println("Tens 300 Skill Points!");
                    System.out.println("---------------------------------");
                } else if (dificuldade == 2) {
                    pontosCriacao = 220;
                    System.out.println("");
                    System.out.println("---------------------------------");
                    System.out.println("Tens 220 Skill Points!");
                    System.out.println("---------------------------------");
                } else {
                    System.out.println("");
                    System.out.println("Opção inválida. Encerrando o jogo.");
                    return;
                }

                System.out.println("");
                System.out.println("⦾ Menu de distribuição de Skill Points");
                System.out.println("");
                System.out.println("• 1 ponto de HP == 1 Skill points.");
                System.out.println("• 1 ponto de força == 5 Skill Points.");
                System.out.println("");
                System.out.println("---------------------------------");
                System.out.println("Pontos de vida disponíveis: " + pontosCriacao);
                System.out.println("---------------------------------");
                System.out.println("");
                System.out.print("Selecione a quantidade de pontos de HP (1:1): ");
                pontosVida = scanner.nextInt();

                if (pontosVida > pontosCriacao) {
                    System.out.println("---------------------------------");
                    System.out.println("Não podes usar mais pontos de vida do que os disponíveis.");
                    System.out.println("---------------------------------");
                    continue;
                }

                System.out.println("");
                System.out.println("---------------------------------");
                System.out.println("Pontos de força disponíveis: " + ((pontosCriacao - pontosVida) / 5));
                System.out.println("---------------------------------");
                System.out.println("");
                System.out.print("Selecione a quantidade de pontos de força (1:5): ");
                pontosForca = scanner.nextInt();

                if (pontosForca > (pontosCriacao - pontosVida) / 5) {
                    System.out.println("---------------------------------");
                    System.out.println("Não podes gastar mais pontos de força do que os disponíveis.");
                    System.out.println("---------------------------------");
                    continue;
                }

                if (pontosVida + pontosForca * 5 != pontosCriacao) {
                    System.out.println("---------------------------------");
                    System.out.println("Distribuição inválida. A soma dos pontos de vida e pontos de força deve ser igual aos pontos de criação.");
                    System.out.println("---------------------------------");
                }
            } while (pontosVida + pontosForca * 5 != pontosCriacao);

            //Atribuir vida e força ao herói
            heroi.setVida(pontosVida);
            heroi.setForca(pontosForca);

            // Atribuir ouro ao herói
            int ouro;
            if (dificuldade == 1) {
                ouro = 20;
            } else {
                ouro = 15;
            }
            heroi.setOuro(ouro);

            // Inicio do labirinto
            System.out.println("");
            System.out.println("Iniciando.. Herói: " + heroi.getClass().getSimpleName() + " " + heroi.getNome() + " / Dificuldade: " + (dificuldade == 1 ? "Fácil" : "Difícil") + ". / Detalhes do herói: " + "Força: " + heroi.getForca() + ", Vida: " + heroi.getVida() + ", Ouro: " + heroi.getOuro() + "");
            System.out.println("");
            System.out.println("★★★★★-Press any number key to buy-★★★★★");
            System.out.print("Any key: ");
            int start = scanner.nextInt();
            System.out.println("");
            System.out.println("------------------------- GAME START -------------------------");
            System.out.println("");
            System.out.println("No coração de um reino repleto de mistérios e lendas..");
            System.out.println("Um jovem herói é convocado para uma missão extraordinária pelo tiranico rei...");
            System.out.println("");
            System.out.println("A nossa história começa agora! Numa estranha e desconhecida terra....");
            System.out.println("");
            System.out.println("Logo de inicio.. Um simpático, mas mesterioso vendedor espalha as suas bujigangas pelo chão poeirento..");
            System.out.println("");
            System.out.println("------------------------- GAME START -------------------------");
            System.out.println("");

            venceu = labirinto(0, heroi);

            if (venceu == true) {
                System.out.println("You Win!");
                heroi.mostrarDetalhes();
            } else {
                System.out.println("Game-0ver");
                System.out.println("Tentar de novo? S/N");
                System.out.print("Resposta: ");
                resposta = scanner.next();
                resposta = resposta.toUpperCase();
                //Input da reposta. Se a resposta for "S", repete.
            }

        } while (resposta.equals("S"));
    }

    /**
     * Função responsável por reiniciar o jogo caso o jogador decida.
     *
     * @param message mensagem exibida ao jogador.
     */

    private static void reset(String message) {

        if (message != null) {  // Verifica se a mensagem não é nula
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n" + message + "\n");  // Exibe a mensagem


            int op;
            do {
                System.out.println("1 - Continuar a jogar!");
                System.out.println("2 - Sair");
                System.out.print("Resposta: ");
                op = scanner.nextInt();
            } while (op < 1 || op > 2);  // Repete o loop se a opção for inválida

            if (op == 1) {  // Se a opção for 1 o método main para reiniciar o jogo
                main(null);
            }
        }
    }


    /**
     * Função que representa o labirinto do jogo.
     *
     * @param op    a opção escolhida pelo jogador.
     * @param heroi o objeto do tipo Heroi representando o jogador.
     * @return true se o jogo continua, false se o jogo termina.
     */

    public static boolean labirinto(int op, Heroi heroi) {
        Scanner scanner = new Scanner(System.in);

        boolean p = false;

        ArrayList<TiposHeroi> tiposHeroi = new ArrayList<>();
        tiposHeroi.add(TiposHeroi.CAVALEIRO);
        tiposHeroi.add(TiposHeroi.ARQUEIRO);
        tiposHeroi.add(TiposHeroi.FEITICEIRO);

        ArrayList<TiposHeroi> todosTiposHeroi = new ArrayList<>();
        todosTiposHeroi.add(TiposHeroi.CAVALEIRO);
        todosTiposHeroi.add(TiposHeroi.ARQUEIRO);
        todosTiposHeroi.add(TiposHeroi.FEITICEIRO);

        ArrayList<TiposHeroi> heroiCavaleiro = new ArrayList<>();
        heroiCavaleiro.add(TiposHeroi.CAVALEIRO);

        ArrayList<TiposHeroi> heroiArqueiro = new ArrayList<>();
        heroiArqueiro.add(TiposHeroi.ARQUEIRO);

        ArrayList<TiposHeroi> heroiFeiticeiro = new ArrayList<>();
        heroiFeiticeiro.add(TiposHeroi.FEITICEIRO);

        //Instancias dos items e NPC's
        PocaoHP pocao1 = new PocaoHP("Poção+1", 5, tiposHeroi, 5);
        PocaoHP pocao2 = new PocaoHP("Poção+2", 15, tiposHeroi, 10);
        PocaoHP pocao3 = new PocaoHP("Poção+3", 10, tiposHeroi, 20);

        Arma cajadoMistico = new Arma("Cajado Místico", 12, heroiFeiticeiro, 25);
        Arma adagaEnvenenada = new Arma("Adaga Envenenada", 15, todosTiposHeroi, 30);
        Arma machadoDeBatalha = new Arma("Machado de Batalha", 18, heroiCavaleiro, 35);
        Arma lancaDeFerro = new Arma("Lança de Ferro", 16, todosTiposHeroi, 30);
        Arma marteloDeGuerra = new Arma("Martelo de Guerra", 20, heroiCavaleiro, 40);
        Arma foiceDePrata = new Arma("Foice de Prata", 14, todosTiposHeroi, 25);
        Arma chicoteFlamejante = new Arma("Chicote Flamejante", 16, heroiArqueiro, 30);
        Arma espadaCurta = new Arma("Espada Curta", 12, todosTiposHeroi, 20);
        Arma arcoDeOsso = new Arma("Arco de Osso", 14, heroiArqueiro, 25);
        Arma machadinhaDeFerro = new Arma("Machadinha de Ferro", 15, todosTiposHeroi, 30);

        NPC morte = new NPC("Caminho errado! >:)", 8000, 9000);
        NPC dragao = new NPC("Dragão Vermelho", 60, 20);
        NPC lich = new NPC("Lich", 60, 20);
        NPC josefina = new NPC("Josefina", 15, 5);
        NPC zodd = new NPC("Zodd o Imortal", 90, 30);

        //Instancia do Vendedor
        Vendedor vendedor1 = new Vendedor();

        vendedor1.adicionarItem(pocao1);
        vendedor1.adicionarItem(pocao2);
        vendedor1.adicionarItem(pocao3);

        vendedor1.adicionarItem(cajadoMistico);
        vendedor1.adicionarItem(adagaEnvenenada);
        vendedor1.adicionarItem(machadoDeBatalha);
        vendedor1.adicionarItem(lancaDeFerro);
        vendedor1.adicionarItem(marteloDeGuerra);
        vendedor1.adicionarItem(foiceDePrata);
        vendedor1.adicionarItem(chicoteFlamejante);
        vendedor1.adicionarItem(espadaCurta);
        vendedor1.adicionarItem(arcoDeOsso);
        vendedor1.adicionarItem(machadinhaDeFerro);


        switch (op) {
            case 0 -> {
                vendedor1.imprimirInventario();
                vendedor1.vender(heroi);
                do {
                    System.out.println("Escolhe o caminho com sabedoria.");
                    System.out.println("");
                    System.out.println("1 - Vale d'morte certeira");
                    System.out.println("2 - Montanha Ensolarada C=");
                    System.out.print("Resposta: ");
                    op = scanner.nextInt();
                } while (op != 1 && op != 2);// Repete o loop se a opção for inválida
                labirinto(op, heroi);  // Chama o método labirinto com os parametros da opção escolhida e o herói
            }
            case 1 -> {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("O Audaz heroi penetra na escuridão do vale.");
                System.out.println("Boa sorte.. Vais precisar >:)  ");
                p = (heroi.atacar(morte) == heroi);  // Verifica se o herói venceu a batalha contra Hades
                if (p) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    System.out.println("Escolha uma opção: ");
                    System.out.println("2 - Montanha");
                    System.out.println("3 - Floresta");
                    System.out.print("Resposta: ");
                    do {
                        op = scanner.nextInt();
                    } while (op != 2 && op != 3);
                    labirinto(op, heroi);
                } else {
                    reset("Game Over!!!");  // Implementação do método reset
                }
            }
            case 2 -> {
                System.out.println("-------------------------------------------");
                System.out.println("");
                System.out.println("Espero que estejas preparado para atravessar a Montanha do Dragão.");
                System.out.println("");
                p = (heroi.atacar(dragao) == heroi);
                if (p) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    labirinto(4, heroi);
                } else {
                    reset("Game Over!!!");
                }
            }
            case 3 -> {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("Sempre a avançar!");
                System.out.println("Vamos entrar na floresta encantada!");
                System.out.println("Cuidado com os contrabandistas e vendedores de banha da cobra!");
                heroi.mostrarDetalhes();
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("VENDEDOR: 'Olá caro amigo viajante!'");
                System.out.println("Interessado em algum dos meus itens?");
                System.out.println("-------------------------------------------");
                System.out.println("");
                vendedor1.imprimirInventario();
                System.out.println("Insira o número correspondente ou 0 para avançar sem comprar)");
                System.out.print("Resposta: ");
                vendedor1.vender(heroi);
                labirinto(5, heroi);
            }
            case 4 -> {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("Que grande batalha contra o Dragão!!");
                System.out.println("");
                System.out.println("Ainda bem que chegamos a uma aldeia bem pitoresca onde poderemos descansar");
                System.out.println("Foi adicionado ao teu inventário uma Poção para recuperares a energia.");
                heroi.adicionarPocao(pocao1);
                System.out.println("Chegamos a uma encruzilhada: ");
                System.out.println("Por onde vamos seguir");
                System.out.println("5 - Esquerda");
                System.out.println("3 - Direita");
                System.out.print("Resposta: ");
                do {
                    op = scanner.nextInt();
                } while (op != 5 && op != 3);
                labirinto(op, heroi);
            }
            case 5 -> {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("Decisões... Decisões");
                System.out.println("Escolha uma opção: ");
                System.out.println("6 - Atravessar o rio a nado?");
                System.out.println("7 - Atravessar uma ponte em muito mau estado?");
                System.out.print("Resposta: ");
                do {
                    op = scanner.nextInt();
                } while (op != 6 && op != 7);
                labirinto(op, heroi);
            }
            case 6 -> {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("O rio está perigoso!");
                System.out.println("");
                System.out.println("Mas há perigos maiores do que a corrente...");
                System.out.println("NECROMANTE: Olá, Olá! Quem temos aqui?");
                System.out.println("");
                System.out.println("Espero que gostes da vista porque a tua alma ficará aprisionada aqui para sempre!");
                System.out.println("HA HA HA HA HA!");
                p = (heroi.atacar(lich) == heroi);
                if (p) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();

                    System.out.println("Escolha uma opção: ");
                    System.out.println("7 - Atravessar uma ponte em muito mau estado?");
                    System.out.println("11 - Pedir boleia ao barqueiro");
                    System.out.print("Resposta: ");

                    do {
                        op = scanner.nextInt();
                    } while (op != 7 && op != 11);

                    labirinto(op, heroi);
                } else {
                    reset("Game Over!!!");
                }
            }
            case 7 -> {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("Esta ponte está muito instável.");
                System.out.println("OOOPPS!!! Cuidado!!!");
                System.out.println("");
                System.out.println("SPLASSSHHH!!");
                System.out.println("");
                System.out.println("Conseguiste chegar até à margem mas bates-te a cabeça e perdes-te muito.. HP");
                heroi.setVida(heroi.getVida() - 15);
                heroi.mostrarDetalhes();
                heroi.usarPocao();
                System.out.println("E agora? Seguimos por um atalho até à Gruta das Sombras?");
                System.out.println("Ou vamos pelo caminho da margem?");
                System.out.println("");
                System.out.println("8 - Caminho da margem");
                System.out.println("9 - Atalho para a Gruta das Sombras");
                System.out.print("Resposta: ");
                do {
                    op = scanner.nextInt();
                } while (op != 8 && op != 9);
                labirinto(op, heroi);
            }
            case 8 -> {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("Que caminho tão bonito e calmo!");
                System.out.println("");
                System.out.println("Oh oh... Falei cedo demais!");
                System.out.println("");
                System.out.println("BRUXA: Ha ha ha ha. És meu!!!");
                p = (heroi.atacar(josefina) == heroi);
                if (p) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    labirinto(10, heroi);
                } else {
                    reset("Game Over!!!");
                }
            }
            case 9 -> {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("Chegamos finalmente à Gruta das Sombras.");
                System.out.println("Julga-se que é aqui que está escondida a Pedra das Trevas...");
                System.out.println("");
                System.out.println("Mas para a recuperarmos temos de enfrentar quem a roubou... E não vai ser pêra doce!");
                System.out.println("");
                heroi.usarPocao();
                System.out.println("O que é este barulho??");
                System.out.println("");
                p = (heroi.atacar(zodd) == heroi);
                if (p) {
                    heroi.mostrarDetalhes();
                    reset("Conseguimos!!! Derrotamos o demónio e recuperamos a Pedra das Trevas!!");
                } else {
                    reset("Game Over!!!");
                }
            }
            case 10 -> {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("UFF... Que medo! Que embuscada!");
                System.out.println("Obviamente que o nosso herói conseguiu desenvencilhar-se da Bruxa com relativa facilidade!");
                System.out.println("");
                System.out.println("Mas agora temos de seguir caminho. Não sem antes passarmos no vendedor novamente!");
                heroi.mostrarDetalhes();
                System.out.println("VENDEDOR: Olá caro amigo viajante!");
                System.out.println("Interessado em algum dos meus itens?");
                System.out.println("");
                vendedor1.imprimirInventario();
                vendedor1.vender(heroi);
                labirinto(9, heroi);
            }
            case 11 -> {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("Decisão sensata! Um barqueiro simpático e no cais temos um vendedor!");
                System.out.println("Tudo o que precisamos para seguir para a Gruta das Sombras!");
                heroi.mostrarDetalhes();
                System.out.println("VENDEDOR: Olá caro amigo viajante!");
                System.out.println("Interessado em algum dos meus itens?");
                System.out.println("");
                vendedor1.imprimirInventario();
                vendedor1.vender(heroi);
                labirinto(9, heroi);
            }
        }
        return true;
    }

    //!------------------------------------------ Fim do Jogo ------------------------------------------

    //*------------------------------------------ Instancias das Classes ------------------------------------------

    /**
     * Cria um novo cavaleiro com base nas informações fornecidas pelo usuário.
     *
     * @return o cavaleiro criado
     */
    public static Cavaleiro criarCavaleiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Qual é o nome do Cavaleiro?");
        System.out.print("Resposta: ");
        String nome = scanner.nextLine();
        // Cria um novo Cavaleiro com o nome fornecido e valores iniciais para os atributos
        return new Cavaleiro(nome, 0, 0, 0, 0);
    }

    /**
     * Cria um novo feiticeiro com base nas informações fornecidas pelo usuário.
     *
     * @return o feiticeiro criado
     */
    public static Feiticeiro criarFeiticeiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Qual é o nome do Feiticeiro?");
        System.out.print("Resposta: ");
        String nome = scanner.nextLine();
        // Cria um novo Feiticeiro com o nome fornecido e valores iniciais para os atributos
        return new Feiticeiro(nome, 0, 0, 0, 0);
    }

    /**
     * Cria um novo arqueiro com base nas informações fornecidas pelo usuário.
     *
     * @return o arqueiro criado
     */
    public static Arqueiro criarArqueiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Qual é o nome do Arqueiro?");
        System.out.print("Resposta: ");
        String nome = scanner.nextLine();
        // Cria um novo Arqueiro com o nome fornecido e valores iniciais para os atributos
        return new Arqueiro(nome, 0, 0, 0, 0);
    }
}