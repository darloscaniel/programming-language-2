package br.edu.fatec.factory;

public class Circle implements Calculable {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
