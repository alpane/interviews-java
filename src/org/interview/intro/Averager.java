package org.interview.intro;

import java.util.List;

public interface Averager<T> {
    public T average(List<T> thingsToAverage);
}
