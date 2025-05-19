package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void area() {
        Rectangle rectangle = new Rectangle(2, 3);
        int actual = rectangle.area();
        assertEquals(6,actual);
    }
    @Test
    void areaWithZeroWidth() {
        Rectangle rectangle = new Rectangle(2, 0);
        int actual = rectangle.area();
        assertEquals(0,actual);
    }
}