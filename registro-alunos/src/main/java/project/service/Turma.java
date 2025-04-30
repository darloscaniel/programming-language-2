package project.service;

import project.model.Aluno;

import java.util.*;
import java.util.stream.Collectors;

public class Turma {
    private final int capacidade;
    private final Map<String, Aluno> alunos;

    public Turma(int capacidade) {
        this.capacidade = capacidade;
        this.alunos = new LinkedHashMap<>();
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (alunos.size() >= capacidade || alunos.containsKey(aluno.getMatricula())) {
            return false;
        }
        alunos.put(aluno.getMatricula(), aluno);
        return true;
    }

    public boolean alterarAluno(String matricula, Aluno novoAluno) {
        if (!alunos.containsKey(matricula)) {
            return false;
        }
        alunos.put(matricula, novoAluno);
        return true;
    }

    public Aluno consultarPorMatricula(String matricula) {
        return alunos.get(matricula);
    }

    public List<Aluno> consultarPorNome(String nome, boolean todos) {
        return alunos.values().stream()
                .filter(a -> a.getNome().equalsIgnoreCase(nome))
                .limit(todos ? Long.MAX_VALUE : 1)
                .collect(Collectors.toList());
    }

    public boolean excluirPorNome(String nome) {
        Optional<String> chave = alunos.entrySet().stream()
                .filter(e -> e.getValue().getNome().equalsIgnoreCase(nome))
                .map(Map.Entry::getKey)
                .findFirst();
        chave.ifPresent(alunos::remove);
        return chave.isPresent();
    }

    public void imprimirOrdemInsercao() {
        alunos.values().forEach(System.out::println);
    }

    public void imprimirOrdenadoPorNome() {
        alunos.values().stream()
                .sorted(Comparator.comparing(Aluno::getNome))
                .forEach(System.out::println);
    }

    public boolean jaExisteMatricula(String matricula) {
        return alunos.containsKey(matricula);
    }
}

