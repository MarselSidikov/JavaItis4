package ru.itis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * 19.04.2017
 * CalculatorTest
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class CalculatorTest {

    Calculator testingCalculator;

    @Before // данный метод запускается перед каждым тестом
    public void setUp() {
        testingCalculator = new Calculator();
    }

    @Test
    public void sumTest() throws Exception {
        int expected = 12;
        int actual = testingCalculator.sum(5, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void divTest() throws Exception {
        int expected = 3;
        int actual = testingCalculator.div(9, 3);

        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divTestOnBadData() throws Exception {
        testingCalculator.div(10, 0);
    }

}