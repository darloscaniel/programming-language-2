import org.example.ex5.Data;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void testConstrutorComParametros() {
        Data data = new Data(15, 10, 2023);
        assertEquals(15, data.getDia());
        assertEquals(10, data.getMes());
        assertEquals(2023, data.getAno());
    }

    @Test
    void testConstrutorSemParametros() {
        Data data = new Data();
        assertNotNull(data.getDia());
        assertNotNull(data.getMes());
        assertNotNull(data.getAno());
    }

    @Test
    void testSetDiaValido() {
        Data data = new Data(15, 10, 2023);
        data.setDia(20);
        assertEquals(20, data.getDia());
    }

    @Test
    void testSetDiaInvalido() {
        Data data = new Data(15, 10, 2023);
        assertThrows(IllegalArgumentException.class, () -> data.setDia(32));
    }

    @Test
    void testAvancarDia() {
        Data data = new Data(31, 12, 2023);
        data.avancarDia();
        assertEquals("01/01/2024", data.toString());
    }

    @Test
    void testToString() {
        Data data = new Data(5, 5, 2023);
        assertEquals("05/05/2023", data.toString());
    }
}