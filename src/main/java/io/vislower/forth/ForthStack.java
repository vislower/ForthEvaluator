package io.vislower.forth;

import java.util.ArrayDeque;
import java.util.Deque;

class ForthStack {
    
    private Deque<Integer> stack;

    public ForthStack() {
        this.stack = new ArrayDeque<>();
    }
}
