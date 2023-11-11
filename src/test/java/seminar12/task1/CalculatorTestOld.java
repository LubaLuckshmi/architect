package seminar12.task1;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTestOld {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = Calculator.add(2, 2);
        assertEquals(4, result);
    }
}
