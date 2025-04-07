package br.edu.fatec.factory;

public class Square implements Calculable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
