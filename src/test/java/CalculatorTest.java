import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
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

    @RepeatedTest(value = 6, name = "{displayName} {currentRepetition} of {totalRepetitions}")
    @DisplayName(value = "Addition Test")
    public void testAddition(){
        assertEquals(5,calc.add(3,2));
    }

    @BeforeEach()
    public void iComeFirst(){
        System.out.println("I Come First");
    }

}
