package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void area() {
        Rectangle rectangle = new Rectangle(2, 3);
        int actual = rectangle.area();
        assertEquals(6, actual);
    }

    @Test
    void areaWithZeroWidth() {
        Rectangle rectangle = new Rectangle(2, 0);
        int actual = rectangle.area();
        assertEquals(0, actual);
    }

    @Test
    void perimeter() {
        Rectangle rectangle = new Rectangle(1, 2);
        int actual = rectangle.perimeter();
        assertEquals(6, actual);
    }
    @Test
    void perimeterWithZeros() {
        Rectangle rectangle = new Rectangle(1, 0);
        int actual = rectangle.perimeter();
        assertEquals(2, actual);
    }

}