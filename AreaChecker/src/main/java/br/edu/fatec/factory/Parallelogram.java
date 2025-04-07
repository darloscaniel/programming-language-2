package br.edu.fatec.factory;

public class Parallelogram implements Calculable{
    private double width;
    private double height;

    public Parallelogram(double width,double height){
        this.height = height;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return (width * height);
    }
}
