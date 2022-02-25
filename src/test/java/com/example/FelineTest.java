package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatShouldReturnList() throws Exception {
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyShouldReturnCorrectStrFeline() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensShouldReturnCorrectCount3() {
        int expected = 3;
        int actual = feline.getKittens(3);
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensShouldReturnCount1() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }
}
