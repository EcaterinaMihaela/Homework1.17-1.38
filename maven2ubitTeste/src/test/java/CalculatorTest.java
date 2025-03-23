import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest
{
    @Test
    public void testAduna()
    {
        Calculator calc = new Calculator();
        assertEquals(10, calc.aduna(7, 3), "7 + 3 ar trebui să fie 10");
    }

    @Test
    public void testInmulteste()
    {
        Calculator calc = new Calculator();
        assertEquals(20, calc.inmulteste(4, 5), "4 * 5 ar trebui să fie 20");
    }
}
