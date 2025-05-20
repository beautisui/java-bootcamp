package models;

import java.util.Objects;

public class Centimeter implements ToCentimeter{
    private final double centimeters;

    public Centimeter(double centimeters) {
        this.centimeters = centimeters;
    }

    public boolean equals(Centimeter o) {
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        System.out.println(centimeters+" centimetes of this");
        System.out.println(that.centimeters+" centimetes of that");
        return centimeters == that.centimeters;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(centimeters);
    }

    @Override
    public Centimeter toCentimeter() {
        return new Centimeter(centimeters);
    }
}
