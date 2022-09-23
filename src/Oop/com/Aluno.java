package Oop.com;

public class Aluno {
    private String nome;
    private String email;
    private String matricula;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "Aluno [nome = " + nome + "]";
    }

}

