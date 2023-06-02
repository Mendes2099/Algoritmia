package Classes;

import java.util.ArrayList;

public class Agenda {

    // ArrayList of Pessoa objects to store the list of people
    private ArrayList<Pessoa> pessoas;

    //!------------------------------------------------------------------------------------------

    // Constructor that takes an ArrayList of Pessoa objects as a parameter and initializes the pessoas field with it
    public Agenda(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    //!------------------------------------------------------------------------------------------

    // Method to add a new Pessoa object to the list of people
    public void add(Pessoa pessoaAdiconar) {
        this.pessoas.add(pessoaAdiconar);
    }

    // Method to list the people in the agenda
    public void list() {
        for (Pessoa i : pessoas) {
            System.out.println(i.getNome());
        }
    }

}

