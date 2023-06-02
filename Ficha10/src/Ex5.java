import Classes.Agenda;
import Classes.Pessoa;

import java.util.ArrayList;

public class Ex5 {

    public static void main(String[] args) {

        ArrayList<Pessoa> osMeusContactosArray = new ArrayList<Pessoa>();

        // Instanciar 3 Objeto2 da classe Pessoa
        Pessoa joao = new Pessoa("João","mendes19966@gmail",26,915474777);
        Pessoa manolo = new Pessoa("Manolo","manolo@gmail",25,91547478);
        Pessoa tassio = new Pessoa("Tassio","Tassio@gmail",34,915474779);

        osMeusContactosArray.add(joao);
        osMeusContactosArray.add(manolo);
        osMeusContactosArray.add(tassio);

        Agenda contactos = new Agenda(osMeusContactosArray);
        contactos.list();
    }


}
