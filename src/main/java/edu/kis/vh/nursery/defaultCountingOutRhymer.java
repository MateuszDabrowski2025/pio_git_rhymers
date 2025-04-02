package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int CAPACITY = 12;
    private static final int EMPTY_VALUE = -1;
    private static final int LAST_INDEX = CAPACITY - 1;

    private final int[] NUMBERS = new int[CAPACITY];
    private int total = -EMPTY_VALUE;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return -EMPTY_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -EMPTY_VALUE;
        return NUMBERS[total--];
    }
}
