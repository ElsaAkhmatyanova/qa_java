package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodShouldReturnCorrectList() throws Exception {
        Lion lion = new Lion(feline,"Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List <String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensShouldReturnCorrectAmount1() throws Exception {
        Lion lion = new Lion(feline,"Самка");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = feline.getKittens();
        assertEquals(expected,actual);
    }

    @Test
    public void haveManeExceptionMessage(){
        try{
            Lion lion = new Lion(feline,"Тест");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка",e.getMessage());
        }
    }
}
