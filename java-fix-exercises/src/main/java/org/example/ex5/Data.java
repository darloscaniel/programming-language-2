package org.example.ex5;

import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida");
        }
    }


    public Data() {
        LocalDate dataAtual = LocalDate.now();
        this.dia = dataAtual.getDayOfMonth();
        this.mes = dataAtual.getMonthValue();
        this.ano = dataAtual.getYear();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validarData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validarData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validarData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido");
        }
    }

    private boolean validarData(int dia, int mes, int ano) {
        try {
            LocalDate.of(ano, mes, dia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void avancarDia() {
        LocalDate data = LocalDate.of(ano, mes, dia).plusDays(1);
        this.dia = data.getDayOfMonth();
        this.mes = data.getMonthValue();
        this.ano = data.getYear();
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
