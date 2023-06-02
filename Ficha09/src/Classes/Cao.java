package Classes;

public class Cao {

    private String nome,raca;

    //__________________________________________________________________________________________________________

    // Atributos nome e raça
    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    //__________________________________________________________________________________________________________

    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }

    // a."Deve conter um método de ladrar (imprime na consola um latido)."
    public void bark() {
        System.out.println("Bark! Bark!");
    }
}
