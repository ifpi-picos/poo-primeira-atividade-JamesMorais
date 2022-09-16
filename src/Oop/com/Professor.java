package Oop.com;

public class Professor {
    private String nome;
    private String email;
    private String formacao;

    public Professor(String nome, String email, String formacao){
        this.nome = nome;
        this.email = email;
        this.formacao = formacao;

    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public boolean equals(Object obj) {
        return this.nome.equals(((Professor) obj).nome);
    }
}

