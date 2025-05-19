package models;

import java.util.Objects;

public class Probability {
    private static double v;

    private Probability(double v) {
        this.v = v;
    }

    public static Probability compliment(double probability) {
        return new Probability(1 - probability);
    }

    public static Probability createProbability(double v) {
        if(v < 0 | v > 1)
            throw new IllegalArgumentException("Invalid probability argument");

        return new Probability(v);
    }

    public boolean equals(Probability o) {
        if (o == null || Probability.class != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(Probability.v, that.v) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(v);
    }

    public static Probability and(Probability probability2) {
        double newProbability = Probability.v * probability2.v;
        return  new Probability(newProbability);
    }
}
