package io.vislower.forth;

import java.util.Deque;

public interface ForthWord {
    void accept(Deque<Integer> stack);

    default void ensureProperSize(int requiredSize, int actualSize, String errorMessage) {
        if (actualSize < requiredSize) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
