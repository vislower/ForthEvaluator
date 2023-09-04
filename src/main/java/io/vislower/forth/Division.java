package io.vislower.forth;

import java.util.Deque;

class Division implements ForthWord{

    @Override
    public void accept(Deque<Integer> stack) {
        ensureProperSize(2, stack.size(), "Division requires that the stack contain at least 2 values");
        if (stack.peek() == 0) {
            throw new IllegalArgumentException("Division by 0 is not allowed");
        }
        int denominator = stack.pop();
        stack.push(stack.pop() / denominator);
    }
    
}
