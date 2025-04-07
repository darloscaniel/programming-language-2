import org.example.ex2.Invoice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void testInvoiceCreation() {
        Invoice invoice = new Invoice("1234", "Mouse sem fio", 3, 59.90);

        assertEquals("1234", invoice.getNumeroItem());
        assertEquals("Mouse sem fio", invoice.getDescricaoItem());
        assertEquals(3, invoice.getQuantidade());
        assertEquals(59.90, invoice.getPrecoUnitario(), 0.01);
        assertEquals(179.70, invoice.getInvoiceAmount(), 0.01);
    }

    @Test
    void testNegativeValuesAreSetToZero() {
        Invoice invoice = new Invoice("5678", "Teclado mecânico", -5, -120.00);

        assertEquals(0, invoice.getQuantidade());
        assertEquals(0.0, invoice.getPrecoUnitario(), 0.01);
        assertEquals(0.0, invoice.getInvoiceAmount(), 0.01);
    }

    @Test
    void testSetQuantidadeWithNegativeValue() {
        Invoice invoice = new Invoice("4321", "Monitor 24\"", 2, 800.00);
        invoice.setQuantidade(-3);

        assertEquals(0, invoice.getQuantidade());
    }

    @Test
    void testSetPrecoUnitarioWithNegativeValue() {
        Invoice invoice = new Invoice("8765", "HD Externo", 5, 350.00);
        invoice.setPrecoUnitario(-50.00);

        assertEquals(0.0, invoice.getPrecoUnitario(), 0.01);
    }

    @Test
    void testInvoiceAmountCalculation() {
        Invoice invoice = new Invoice("1111", "Cadeira Gamer", 2, 750.00);
        assertEquals(1500.00, invoice.getInvoiceAmount(), 0.01);

        invoice.setQuantidade(4);
        invoice.setPrecoUnitario(800.00);
        assertEquals(3200.00, invoice.getInvoiceAmount(), 0.01);
    }
}

