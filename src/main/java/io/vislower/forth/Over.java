package io.vislower.forth;

import java.util.Deque;

class Over implements ForthWord{

    @Override
    public void accept(Deque<Integer> stack) {
        ensureProperSize(2, stack.size(), "Overing requires that the stack contain at least 2 values");
        int head = stack.pop();
        int over = stack.peek();
        stack.push(head);
        stack.push(over);
    }
    
}
