package models;

import java.util.Objects;

public class Length {
    private final double inches;

    private Length(double inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "Length{" +
                "inches=" + inches +
                '}';
    }

    public static Length fromInches(double inches) {
        return new Length(inches);
    }

    public static Length fromFeet(double feet) {
        return new Length(feet * 12);
    }

    public static Length fromCentimeters(double cm) {
        return new Length(cm / 2.5);
    }

    public static Length fromMillimeters(double mm) {
        return new Length( mm /25);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return inches == length.inches;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inches);
    }

    public Length add(Length anotherLength) {
        return new Length(anotherLength.inches + inches);
    }
}
