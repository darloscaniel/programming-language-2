package br.edu.fatec.main;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class AreaCheckerApplication {
    public static void main(String[] args){
        ShapeFactoryImpl factory = new ShapeFactoryImpl();

        Calculable square = factory.getShape(ShapeType.Square, new Double[]{4.0});
        System.out.println("Área do quadrado: " + square.calculateArea());

        Calculable circle = factory.getShape(ShapeType.Circle, new Double[]{6.0});
        System.out.println("Área do círculo: " + circle.calculateArea());

        Calculable cube = factory.getShape(ShapeType.Cube, new Double[]{8.0});
        System.out.println("Área do cubo: " + cube.calculateArea());

        Calculable diamond = factory.getShape(ShapeType.Diamond, new Double[]{6.0, 8.0});
        System.out.println("Área do losango: " + diamond.calculateArea());

        Calculable hexagon = factory.getShape(ShapeType.Hexagon, new Double[]{3.0});
        System.out.println("Área do hexágono: " + hexagon.calculateArea());

        Calculable parallelogram = factory.getShape(ShapeType.Parallelogram, new Double[]{7.0, 3.0});
        System.out.println("Área do paralelogramo: " + parallelogram.calculateArea());

        Calculable rectangle = factory.getShape(ShapeType.Rectangle, new Double[]{6.0, 4.0});
        System.out.println("Área do retângulo: " + rectangle.calculateArea());

        Calculable trapezo = factory.getShape(ShapeType.Trapezium, new Double[]{6.0, 4.0, 3.0});
        System.out.println("Área do trapézio: " + trapezo.calculateArea());

        Calculable triangle = factory.getShape(ShapeType.Triangle, new Double[]{6.0, 5.0});
        System.out.println("Área do triângulo: " + triangle.calculateArea());
    }
}
