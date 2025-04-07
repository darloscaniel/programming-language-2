package br.edu.fatec.factory;

public class Cube implements Calculable{
    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
       return 6 * Math.pow(side, 2);
    }
}
