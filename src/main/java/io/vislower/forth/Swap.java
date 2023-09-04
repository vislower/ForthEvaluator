package io.vislower.forth;

import java.util.Deque;

class Swap implements ForthWord{

    @Override
    public void accept(Deque<Integer> stack) {
        ensureProperSize(2, stack.size(), "Swapping requires that the stack contain at least 2 values");
        int first = stack.pop();
        int second = stack.pop();
        stack.push(first);
        stack.push(second);
    }
    
}
