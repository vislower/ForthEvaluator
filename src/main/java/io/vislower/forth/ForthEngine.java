package io.vislower.forth;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ForthEngine {
    
    Deque<Integer> stack;
    private Map<String, String> forthDictionary;

    public ForthEngine() {
        this.stack = new ArrayDeque<>();
        this.forthDictionary = new HashMap<>();
    }

    public List<Integer> evaluateInput(List<String> input) {

        for (String expression : input) {
            
            String[] command = expression.split(" ");

            for (String word : command) {
                // parse command ...
            }
        }

        return new ArrayList<>(this.stack);
    }
}
