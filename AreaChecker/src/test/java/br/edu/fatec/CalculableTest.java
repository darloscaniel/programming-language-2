package br.edu.fatec;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculableTest{

    private final ShapeFactoryImpl factory = new ShapeFactoryImpl();

    @Test
    void testSquareArea() {
        Calculable shape = factory.getShape(ShapeType.Square, new Double[]{4.0});
        assertEquals(16.0, shape.calculateArea());
    }

    @Test
    void testRectangleArea() {
        Calculable shape = factory.getShape(ShapeType.Rectangle, new Double[]{5.0, 3.0});
        assertEquals(15.0, shape.calculateArea());
    }

    @Test
    void testCircleArea() {
        Calculable shape = factory.getShape(ShapeType.Circle, new Double[]{3.0});
        assertEquals(Math.PI * 9, shape.calculateArea(), 0.001);
    }

    @Test
    void testTriangleArea() {
        Calculable shape = factory.getShape(ShapeType.Triangle, new Double[]{6.0, 2.0});
        assertEquals(6.0, shape.calculateArea());
    }

    @Test
    void testParallelogramArea() {
        Calculable shape = factory.getShape(ShapeType.Parallelogram, new Double[]{4.0, 5.0});
        assertEquals(20.0, shape.calculateArea());
    }

    @Test
    void testTrapezoidArea() {
        Calculable shape = factory.getShape(ShapeType.Trapezium, new Double[]{3.0, 5.0, 4.0});
        assertEquals(16.0, shape.calculateArea());
    }

    @Test
    void testHexagonArea() {
        Calculable shape = factory.getShape(ShapeType.Hexagon, new Double[]{2.0});
        double expectedArea = ((3 * Math.sqrt(3)) / 2) * Math.pow(2.0, 2);
        assertEquals(expectedArea, shape.calculateArea(), 0.001);
    }

    @Test
    void testDiamondArea() {
        Calculable shape = factory.getShape(ShapeType.Diamond, new Double[]{6.0, 4.0});
        assertEquals(12.0, shape.calculateArea());
    }

    @Test
    void testCubeArea() {
        Calculable shape = factory.getShape(ShapeType.Cube, new Double[]{3.0});
        assertEquals(54.0, shape.calculateArea());
    }
}
