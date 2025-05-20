package models;

public class Feet implements ToCentimeter {
    private final int feet;

    public Feet(int feet) {
        this.feet = feet;
    }

    @Override
    public Centimeter toCentimeter() {
        return new Centimeter(feet * 30);
    }
}
