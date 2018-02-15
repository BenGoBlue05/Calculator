import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp()  {
        calculator = new Calculator();
    }

    @Test
    public void multiplyEmptyString() {
        Assert.assertEquals(0, calculator.multiply(new String[]{""}));
    }

    @Test
    public void multiplyOneNumber() {
        int num = getRandomInt();
        Assert.assertEquals(num, calculator.multiply(new String[]{String.valueOf(num)}));
    }

    @Test
    public void multiplyTwoNumbers() {
        for (int i = 0; i < 1000; i++) {
            int num1 = getRandomInt();
            int num2 = getRandomInt();
            int product = num1 * num2;
            String[] nums = {String.valueOf(num1), String.valueOf(num2)};
            Assert.assertEquals(product, calculator.multiply(nums));
        }
    }

    //positive or negative
    private int getRandomInt(){
        return new Random().nextInt(100000) - 50000;
    }
}