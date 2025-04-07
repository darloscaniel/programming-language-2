package br.edu.fatec.factory;

public class Trapezo implements Calculable{
    private double smallestBase;
    private double biggestBase;
    private double height;

    public Trapezo(double biggestBase, double smallestBase, double height){
        this.biggestBase = biggestBase;
        this.smallestBase = smallestBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((smallestBase + biggestBase) * height)/2;
    }
}
