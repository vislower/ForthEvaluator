package io.vislower.forth;

import java.util.Deque;

class Addition implements ForthWord{

    @Override
    public void accept(Deque<Integer> stack) {
        ensureProperSize(2, stack.size(), "Addition requires that the stack contain at least 2 values");
        stack.push(stack.pop() + stack.pop());
    }
    
}
