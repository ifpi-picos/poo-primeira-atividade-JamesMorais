package Oop.com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Professor professor;
    private int cargaHoraria;
    private String modalidade;
    private String nivel;
    private LocalDate dataInicio;
    private LocalDate dataConclusao;
    private List<Aluno> alunos;
    private String instituicao;
    private boolean gratuidade;

    public Curso(String nome, Professor professor, int cargaHoraria, String modalidade, String nivel, String instituicao, boolean gratuidade ) {
        this.nome = nome;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
        this.modalidade = modalidade;
        this.nivel = nivel;
        this.instituicao = instituicao;
        this.gratuidade = gratuidade;
        this.alunos = new ArrayList<>();
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }
    @Override
    public String toString() {
        return "Nome:" +nome + "\n" + "Professor: " +professor.getNome() + "\n" + "Carga Horária: " +cargaHoraria + "\n" + "modalidade: " +modalidade +"\n" + "Nivel: " +nivel + "\n" + "Instituição: " +instituicao + "\n" + "Gratuídade: " +gratuidade + "\n" +getAlunos() + "\n" +"Quantidade de alunos: " +getQuantidade(); }


    public void MatricularAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public int getQuantidade(){
        return this.alunos.size();
    }

    public String getGratuidade() {
        if (gratuidade != true) {
            return "O curso: " + this.nome + "," + "Tem o valor total de 35.000,00.";
        }
        else {
            return "Curso gratuíto";
        }
    }


}
