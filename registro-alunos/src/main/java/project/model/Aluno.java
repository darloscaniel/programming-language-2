package project.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    private List<Nota> notas;

    public Aluno(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double valor, double peso) {
        if (notas.size() < 4)
            notas.add(new Nota(valor, peso));
    }

    public double calcularMediaPonderada() {
        double somaNotas = 0, somaPesos = 0;
        for (Nota nota : notas) {
            somaNotas += nota.getValor() * nota.getPeso();
            somaPesos += nota.getPeso();
        }
        return somaPesos == 0 ? 0 : somaNotas / somaPesos;
    }
}

