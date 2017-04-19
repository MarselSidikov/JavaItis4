package ru.itis;

import org.junit.Assert;
import org.junit.Test;

/**
 * 19.04.2017
 * SummatorTest
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SummatorTest {

    @Test
    public void sumTest() throws Exception {
        Summator testingSummator = new Summator();

        int expected = 12;
        int actual = testingSummator.sum(5, 6);
        Assert.assertEquals(expected, actual);
    }

}