import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Ex1Test {

    @Test
    public void testMinimoPositivo() {
        int[] numbers = {4, 2, 1, 8, 5};
        int result = ArrayUtils.findMinimum(numbers);
        assertEquals(1, result);
    }

    @Test
    public void testMinimoNegativo() {
        int[] numbers = {-6, -2, -40, -1, -6};
        int result = ArrayUtils.findMinimum(numbers);
        assertEquals(-40, result);
    }

    @Test
    public void testEncontrarMinimoVariado() {
        int[] numbers = {-2, 33, -33, 42, -9};
        int result = ArrayUtils.findMinimum(numbers);
        assertEquals(-33, result);
    }

    @Test
    public void testMinimo() {
        int[] numbers = {2};
        int result = ArrayUtils.findMinimum(numbers);
        assertEquals(2, result);
    }

    @Test
    public void testMinimoVazio() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.findMinimum(numbers);
        });
    }

    @Test
    public void testMinimoRepetido() {
        int[] numbers = {33, 7, 7, 66, 23};
        int result = ArrayUtils.findMinimum(numbers);
        assertEquals(7, result);
    }

    @Test
    public void testMinimoGrande() {
        int[] numbers = {5000, 5500, 7000, 300, 40560};
        int result = ArrayUtils.findMinimum(numbers);
        assertEquals(300, result);
    }
}
