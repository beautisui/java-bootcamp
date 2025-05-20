package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareMeasurementsTest {

    @Test
    void compareFeetAndInches() {
        CompareMeasurements<Feet,Inches> compareMeasurements =  new CompareMeasurements<Feet,Inches>(new Feet(1),new Inches(12));
        assert(compareMeasurements.compare());
    }

    @Test
    void compareInchesAndCentimeters() {
        CompareMeasurements<Inches, Centimeter> compareMeasurements =  new CompareMeasurements<Inches, Centimeter>(new Inches(2), new Centimeter(5));
        assert(compareMeasurements.compare());
    }
}