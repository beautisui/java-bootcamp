package models;

public class Inches implements ToCentimeter{
    private final int inches;

    public Inches(int inches) {
        this.inches = inches;
    }

    @Override
    public Centimeter toCentimeter() {
        return new Centimeter(this.inches * 2.5);
    }

}
