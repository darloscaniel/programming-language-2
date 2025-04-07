package br.edu.fatec.factory;

public class Rectangle implements Calculable{
    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return (width * height);
    }
}
