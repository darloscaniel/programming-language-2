package br.edu.fatec.factory;

public class Triangle implements Calculable{
    private double width;
    private double height;

    public Triangle(double width, double height){
        this.height = height;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return (width * height)/2;
    }
}
