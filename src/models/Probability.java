package models;

import java.util.Objects;

public class Probability {
    @Override
    public String toString() {
        return "Probability{" +
                "v=" + v +
                '}';
    }

    private final double v;

    private Probability(double v) {
        this.v = v;
    }

    public  Probability compliment() {
        return new Probability(1 - v);
    }

    public static Probability createProbability(double v) {
        if (v < 0 | v > 1)
            throw new IllegalArgumentException("Invalid probability argument");

        return new Probability(v);
    }

    public boolean equals(Probability o) {
        if (o == null || Probability.class != o.getClass()) return false;
        Probability that = (Probability) o;
        return v == that.v;
    }



    @Override
    public int hashCode() {
        return Objects.hashCode(v);
    }

    public  Probability and(Probability probability2) {
        double newProbability = v * probability2.v;
        return new Probability(newProbability);
    }

    public Probability or(Probability probability2) {
        //Formula P(A || B) = P(A) + P(B) - P(A) * P(B)
        double sumOfProbability = probability2.v + v;
        Probability productOfProbability = this.and(probability2);

        return new Probability(sumOfProbability - (productOfProbability.v));
    }


}
