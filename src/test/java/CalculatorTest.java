import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Created by covenant on 6/7/17.
 */


public class CalculatorTest {

    Calculator calc;

    public CalculatorTest(){
        calc = new Calculator();
    }

    @Test
    public void testSubtract(){
        assertEquals(4, calc.substract(9, 5));
    }

}
