package io.vislower.forth;

import java.util.Deque;

class Substraction implements ForthWord{

    @Override
    public void accept(Deque<Integer> stack) {
        ensureProperSize(2, stack.size(), "Substraction requires that the stack contain at least 2 values");
        int substract = stack.pop();
        stack.push(stack.pop() - substract);
    }
    
}
