package controller;

public class Pair<T, Z> {
    private T first;
    private Z second;

    public Pair(T first, Z second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public Z getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("First: %s, second: %s", first, second);
    }
}
