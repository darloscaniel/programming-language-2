import org.example.ex3.Empregado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void testEmpregadoCreation() {
        Empregado empregado = new Empregado("Carlos", "Silva", 3000.00);

        assertEquals("Carlos", empregado.getPrimeiroNome());
        assertEquals("Silva", empregado.getSobrenome());
        assertEquals(3000.00, empregado.getSalarioMensal(), 0.01);
        assertEquals(36000.00, empregado.getSalarioAnual(), 0.01);
    }

    @Test
    void testSalarioNegativoDeveSerZero() {
        Empregado empregado = new Empregado("Ana", "Souza", -2500.00);

        assertEquals(0.0, empregado.getSalarioMensal(), 0.01);
        assertEquals(0.0, empregado.getSalarioAnual(), 0.01);
    }

    @Test
    void testAumentoDeSalario() {
        Empregado empregado = new Empregado("Lucas", "Pereira", 5000.00);

        empregado.aumentarSalario(10); // Aumenta 10%
        assertEquals(5500.00, empregado.getSalarioMensal(), 0.01);
        assertEquals(66000.00, empregado.getSalarioAnual(), 0.01);
    }

    @Test
    void testAumentoComPorcentagemNegativaNaoAfetaSalario() {
        Empregado empregado = new Empregado("Mariana", "Costa", 4000.00);

        empregado.aumentarSalario(-5);
        assertEquals(4000.00, empregado.getSalarioMensal(), 0.01);
    }
}
