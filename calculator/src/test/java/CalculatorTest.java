import org.junit.Test;
import static org.junit.Assert.*;
import calculator.Addition;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Addition obj = new Addition();
        int result = obj.add(2, 3);
        assertEquals(5, result);
    }
}
