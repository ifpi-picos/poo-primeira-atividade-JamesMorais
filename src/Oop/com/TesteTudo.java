package Oop.com;


import java.util.Scanner;

public class TesteTudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Professor professor = new Professor("Ana Lúcia", "analuh@gmail.com", "geografia");
        Curso curso = new Curso("ADS", professor, 20, "Presencial", "Superior", "IFPI", true);

        for(int i = 0; i <2; i++){
            System.out.println("Insira o nome do aluno: ");
            String nome = scanner.next();
            curso.MatricularAluno(new Aluno(nome));


        }
        System.out.println(curso);
    }
}

