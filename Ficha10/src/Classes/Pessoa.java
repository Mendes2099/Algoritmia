package Classes;

public class Pessoa {

    private String nome, email;
    private int idade, telemóvel;

    //------------------------------------------------------------------------------------------
    public Pessoa(String nome, String email, int idade, int telemóvel) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.telemóvel = telemóvel;
    }
    //------------------------------------------------------------------------------------------


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelemóvel() {
        return telemóvel;
    }

    public void setTelemóvel(int telemóvel) {
        this.telemóvel = telemóvel;
    }

}