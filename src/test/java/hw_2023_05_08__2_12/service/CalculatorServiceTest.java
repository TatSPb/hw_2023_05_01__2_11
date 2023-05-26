package hw_2023_05_08__2_12.service;

import hw_2023_05_08__2_12.exception.DivByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.DigestException;

public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest() {
        Number actual = calculatorService.plus(1, 3);
        Number expected = 4;
        Assertions.assertEquals(expected, actual);

        actual = calculatorService.plus(4, 2);
        expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusTest() {
        Number actual = calculatorService.minus(1, 3);
        Number expected = -2;
        Assertions.assertEquals(expected, actual);

        actual = calculatorService.minus(-10, 6);
        expected = -16;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest() {
        Number actual = calculatorService.multiply(1, 3);
        Number expected = 3;
        Assertions.assertEquals(expected, actual);

        actual = calculatorService.multiply(-10, 6);
        expected = -60;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideTest() {
        Number actual = calculatorService.divide(4, 2);
        Number expected = 2.0;
        Assertions.assertEquals(expected, actual);

        actual = calculatorService.divide(-10, 2);
        expected = -5.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideNegativeTest() {
        Assertions.assertThrows(DivByZeroException.class, () -> calculatorService.divide(1, 0));
        Assertions.assertThrows(DivByZeroException.class, () -> calculatorService.divide(-1, 0));
    }
}
