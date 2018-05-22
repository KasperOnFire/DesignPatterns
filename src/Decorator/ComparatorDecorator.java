package Decorator;

import java.util.Comparator;

public class ComparatorDecorator<T> implements Comparator<T> {
    private int count;
    private final Comparator<T> original;

    public ComparatorDecorator(Comparator<T> c) {
        original = c;
        count = 0;
    }

    @Override
    public int compare(T o1, T o2) {
        count++;
        return original.compare(o1, o2);
    }

    public int getCount() {
        return count;
    }

    public void reset() {
        count = 0;
    }
}
