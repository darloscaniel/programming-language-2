package project.model;

import java.time.LocalDate;

public class RegistroPrecipitacao {
    private double precipitacao;
    private LocalDate  data;

    public RegistroPrecipitacao(LocalDate data, double precipitacao) {
        this.precipitacao = precipitacao;
        this.data = data;
    }

    public double getPrecipitacao() {
        return precipitacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setPrecipitacao(double precipitacao) {
        this.precipitacao = precipitacao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data + " - " + precipitacao + "mm";
    }
}
