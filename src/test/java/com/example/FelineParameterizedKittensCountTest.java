package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedKittensCountTest {

    private final int actual;
    private final int expected;

    public FelineParameterizedKittensCountTest(int actual, int expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCountData() {
        return new Object[][] {
                {2, 2},
                {3, 3},
                {4, 4},
                {5, 5},
        };
    }

    @Test
    public void felineGetKittensShouldReturnCorrectCount() {
        Feline feline = new Feline();
        int actualCount = feline.getKittens(actual);
        assertEquals(expected, actualCount);
    }
}
