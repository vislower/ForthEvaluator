package io.vislower.forth;

import java.util.Deque;

class Drop implements ForthWord{

    @Override
    public void accept(Deque<Integer> stack) {
        ensureProperSize(1, stack.size(), "Dropping requires that the stack contain at least 1 value");
        stack.pop();
    }
    
}
