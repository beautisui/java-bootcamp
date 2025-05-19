package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void area() {
        Square square = new Square(4);
        int actual = square.area();
        assertEquals(16,actual);
    }

    @Test
    void perimeter() {
        Square square = new Square(3);
        int actual = square.perimeter();
        assertEquals(12,actual);
    }

}