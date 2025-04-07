package br.edu.fatec.factory;

public class Diamond implements Calculable{
    private double height;
    private double width;

    public Diamond(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (width * height)/2;
    }
}
