package org.interview.intro;

import java.util.List;

public class DoubleAverager implements Averager<Double> {
    public Double average(List<Double> numbers) {
        verifyNonEmpty(numbers.size());

        Double total = 0.0;
        for (Double number : numbers) {
            total += number;
        }


        return total / numbers.size();
    }

    private void verifyNonEmpty(int count) {
        if (count <= 1) {
            throw new EmptyListCannotBeAveraged();
        }
    }

    public static class EmptyListCannotBeAveraged extends RuntimeException {

    }
}
