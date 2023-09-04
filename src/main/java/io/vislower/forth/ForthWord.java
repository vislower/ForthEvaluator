package io.vislower.forth;

import java.util.Deque;

public interface ForthWord {
    boolean accept(Deque<Integer> stack);

    default boolean ensureProperSize(int requiredSize, int actualSize, String errorMessage) {
        if (actualSize < requiredSize) {
            throw new IllegalArgumentException(errorMessage);
        }
        return true;
    }

    
}
