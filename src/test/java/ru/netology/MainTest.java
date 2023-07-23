package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.CircleArea;

public class MainTest {
    CircleArea circleArea;

    @BeforeEach
    public void beforeEachTest() {
        circleArea = new CircleArea();
        double expected = 3.14;
        double result = CircleArea.pi;

        Assertions.assertEquals(expected, result);
    }
    @Test
    public void areaCircleTest() {
        // arrange
        double expected = 452.16, a = 3.14;
        int b = 12;
        // act
        double result = CircleArea.areaCircle(a, b);
        // assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void lengthCircleTest() {
        // arrange
        double expected = 75.36;
        int b = 12;
        // act
        double result = CircleArea.lengthCircle(2,CircleArea.pi,b);
        // assert
        Assertions.assertEquals(expected, result);
    }
}
