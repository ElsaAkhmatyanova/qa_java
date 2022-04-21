package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedManeTest {

    @Mock
    Feline feline;
    private final String actual;
    private final boolean expected;

    public LionParameterizedManeTest(String actual, boolean expected){
        this.actual = actual;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getManeData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Тест exception", true},
        };
    }

    @Test
    public void lionHaveManeCorrectValue () throws Exception {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion(feline, actual);
            boolean actual = lion.doesHaveMane();
            assertEquals(expected, actual);
        }
        catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }
}
