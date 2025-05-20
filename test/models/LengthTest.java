package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void compareInchesAndFeet() {
        Length length1 = Length.fromInches(12);
        Length length2 = Length.fromFeet(1);

        assertEquals(length1,length2);
    }

    @Test
    void compareInchesAndCentimeters() {
        Length length1 = Length.fromInches(2);
        Length length2 = Length.fromCentimeters(5);

        assertEquals(length1,length2);
    }

    @Test
    void compareCentimetersAndMilliMeters() {
        Length length1 = Length.fromCentimeters(1);
        Length length2 = Length.fromMillimeters(10);

        assertEquals(length1,length2);
    }

    @Test
    void addTwoInches() {
        Length length1 = Length.fromInches(2);
        Length length2 = Length.fromInches(2);

        Length sumOfInches = length1.add(length2);
        Length expectedSum = Length.fromInches(4);

        assertEquals(sumOfInches, expectedSum);

    }
}