import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTests {
    Calculator calculator = new Calculator();

    @Test
    public void testAds() {
        //arrange
        int a = 5, b = 7, expected = 12;
        //act
        var result = calculator.plus.apply(a, b);
        //assert
        Assertions.assertEquals(result, expected);
    }
}
