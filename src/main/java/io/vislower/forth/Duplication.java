package io.vislower.forth;

import java.util.Deque;

class Duplication implements ForthWord{

    @Override
    public void accept(Deque<Integer> stack) {
        ensureProperSize(1, stack.size(), "Duplicating requires that the stack contain at least 1 value");
        stack.push(stack.peek());
    }
    
}
