package project;

import project.model.Aluno;
import project.service.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma(3);

        Aluno a1 = new Aluno("2023001", "Carlos", "Sistemas");
        a1.adicionarNota(8, 2);
        a1.adicionarNota(7, 1);
        a1.adicionarNota(9, 2);
        a1.adicionarNota(10, 1);

        Aluno a2 = new Aluno("2023002", "Ana", "Banco de Dados");
        a2.adicionarNota(6, 2);
        a2.adicionarNota(8, 2);
        a2.adicionarNota(7, 1);
        a2.adicionarNota(9, 1);

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        System.out.println("Impressão em ordem de inserção:");
        turma.imprimirOrdemInsercao();

        System.out.println("\nImpressão ordenada por nome:");
        turma.imprimirOrdenadoPorNome();

        System.out.println("\nConsulta por matrícula:");
        System.out.println(turma.consultarPorMatricula("2023001"));

        System.out.println("\nConsulta por nome (todos):");
        turma.consultarPorNome("Ana", true).forEach(System.out::println);
    }
}
