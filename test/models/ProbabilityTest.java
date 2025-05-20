package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void chancesToGetTail() {
        Probability probability = Probability.createProbability(0.5).compliment();
        Probability expectedProbability = Probability.createProbability(0.5);
        Boolean actual = expectedProbability.equals(probability);
        assert (actual);
    }

    @Test
    void invalidProbability() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Probability.createProbability(-2));
        assertEquals("Invalid probability argument",exception.getMessage());
    }

    @Test
    void chancesToGetBothTail() {
        Probability probability1 = Probability.createProbability(0.5);
        Probability probability2 = Probability.createProbability(0.5);

        Probability actualProbability = probability1.and(probability2);
        Probability expectedProbability = Probability.createProbability(0.25);
        assert(actualProbability.equals(expectedProbability));
    }


    @Test
    void chancesToGetAtleastOneTail() {
        Probability probability1 = Probability.createProbability(0.5);
        Probability probability2 = Probability.createProbability(0.5);

//        Formula P(A || B) = P(A) + P(B) - P(A) * P(B)

        Probability actualProbability = probability1.or(probability2);
        Probability expectedProbability = Probability.createProbability(0.75);
        assert(expectedProbability.equals(actualProbability));
    }
}