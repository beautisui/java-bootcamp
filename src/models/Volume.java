package models;

import sun.security.util.Length;

import java.util.Objects;

public class Volume {

    private final double litres;

    private Volume(double litres) {
        this.litres = litres;
    }

    public static Volume fromGallon(double gallon) {
        return new Volume(gallon * 3.78);
    }

    public static Volume fromLitres(double litres) {
        return new Volume(litres);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return litres == volume.litres;
    }

    @Override
    public int hashCode() {



        return Objects.hashCode(litres);
    }
}

