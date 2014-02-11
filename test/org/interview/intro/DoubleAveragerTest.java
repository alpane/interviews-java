package org.interview.intro;

import org.interview.intro.DoubleAverager.EmptyListCannotBeAveraged;
import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class DoubleAveragerTest {
    @Test
    public void shouldAverageABunchOfNumbers() {
        Averager<Double> averager = new DoubleAverager();

        double average = averager.average(asList(6.0, 6.0, 5.0, 5.0));
        assertEquals(5.5, average, 0.0);
    }

    @Test(expected = EmptyListCannotBeAveraged.class)
    public void emptyListsCannotBeAveraged() {
        Averager<Double> averager = new DoubleAverager();
        averager.average(Collections.<Double>emptyList());
    }
}
