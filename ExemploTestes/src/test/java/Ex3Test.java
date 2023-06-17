import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ex3Test {
    @Test
    public void testPositivos() {
        int numero = 7;
        int expected = 5040;
        int actual = Fatorial.calcular(numero);
        assertEquals(expected, actual);
    }

    @Test
    public void testZero() {
        int numero = 0;
        int expected = 1;
        int actual = Fatorial.calcular(numero);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativo() {
        int numero = -7;
        assertThrows(IllegalArgumentException.class, () -> {
            Fatorial.calcular(numero);
        });
    }
}

