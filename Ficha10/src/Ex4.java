import Classes.AcabamentoImovel;
import Classes.Imovel;
import Classes.TipoImovel;

public class Ex4 {
    public static void main(String[] args) {

        // Instanciar 1 Objeto da classe Imovel
        Imovel casa = new Imovel("rua da esperança", "Porto", 22, 4, 3, 400, 50, TipoImovel.apartamento, AcabamentoImovel.usada);
        Imovel casa2 = new Imovel("rua da esperança", "Porto", 24, 8, 6, 800, 100, TipoImovel.mansão, AcabamentoImovel.nova);
        //------------------------------------------------------------------------------------------

        System.out.println("");

        casa.valor();

        System.out.println("");

        casa.imprimirDescricao();

        System.out.println("");

        casa.compararImoveis(casa2);




        //------------------------------------------------------------------------------------------
    }
}
