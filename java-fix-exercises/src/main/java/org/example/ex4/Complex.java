package org.example.ex4;

public class Complex {
    private double real;
    private double imaginario;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real) {
        this(real, 0);
    }


    public Complex(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }

    public double angulo() {
        return Math.atan2(imaginario, real);
    }

    public Complex inversoAditivo() {
        return new Complex(-real, -imaginario);
    }

    public Complex soma(Complex outro) {
        return new Complex(this.real + outro.real, this.imaginario + outro.imaginario);
    }

    public Complex subtracao(Complex outro) {
        return new Complex(this.real - outro.real, this.imaginario - outro.imaginario);
    }

    public Complex multiplicacao(Complex outro) {
        double novoReal = this.real * outro.real - this.imaginario * outro.imaginario;
        double novoImaginario = this.real * outro.imaginario + this.imaginario * outro.real;
        return new Complex(novoReal, novoImaginario);
    }

    public Complex divisao(Complex outro) {
        double divisor = outro.real * outro.real + outro.imaginario * outro.imaginario;
        double novoReal = (this.real * outro.real + this.imaginario * outro.imaginario) / divisor;
        double novoImaginario = (this.imaginario * outro.real - this.real * outro.imaginario) / divisor;
        return new Complex(novoReal, novoImaginario);
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", real, imaginario);
    }
}
