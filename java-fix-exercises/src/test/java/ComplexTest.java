import org.example.ex4.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void testComplexCreation() {
        Complex c1 = new Complex();
        Complex c2 = new Complex(5);
        Complex c3 = new Complex(3, 4);

        assertEquals(0, c1.getReal());
        assertEquals(0, c1.getImaginario());

        assertEquals(5, c2.getReal());
        assertEquals(0, c2.getImaginario());

        assertEquals(3, c3.getReal());
        assertEquals(4, c3.getImaginario());
    }

    @Test
    void testModulo() {
        Complex c = new Complex(3, 4);
        assertEquals(5.0, c.modulo(), 0.01);
    }

    @Test
    void testAngulo() {
        Complex c = new Complex(1, 1);
        assertEquals(Math.PI / 4, c.angulo(), 0.01);
    }

    @Test
    void testInversoAditivo() {
        Complex c = new Complex(2, -3);
        Complex inverso = c.inversoAditivo();
        assertEquals(-2, inverso.getReal(), 0.01);
        assertEquals(3, inverso.getImaginario(), 0.01);
    }

    @Test
    void testSoma() {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(1, -4);
        Complex resultado = c1.soma(c2);

        assertEquals(3, resultado.getReal(), 0.01);
        assertEquals(-1, resultado.getImaginario(), 0.01);
    }

    @Test
    void testSubtracao() {
        Complex c1 = new Complex(5, 6);
        Complex c2 = new Complex(2, 3);
        Complex resultado = c1.subtracao(c2);

        assertEquals(3, resultado.getReal(), 0.01);
        assertEquals(3, resultado.getImaginario(), 0.01);
    }

    @Test
    void testMultiplicacao() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex resultado = c1.multiplicacao(c2);

        assertEquals(-5, resultado.getReal(), 0.01);
        assertEquals(10, resultado.getImaginario(), 0.01);
    }

    @Test
    void testDivisao() {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(1, -1);
        Complex resultado = c1.divisao(c2);

        assertEquals(-0.5, resultado.getReal(), 0.01);
        assertEquals(2.5, resultado.getImaginario(), 0.01);
    }
}

