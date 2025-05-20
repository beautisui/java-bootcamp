package models;

public class CompareMeasurements <T1 extends ToCentimeter, T2 extends ToCentimeter>{


    private final T1 measurement1;
    private final T2 measurement2;

    public CompareMeasurements(T1 measurement1, T2 measurement2) {
        this.measurement1 = measurement1;
        this.measurement2 = measurement2;
    }

    public Boolean compare() {
        Centimeter cm1 = measurement1.toCentimeter();
        Centimeter cm2 = measurement2.toCentimeter();

        return cm1.equals(cm2);
    }
}
