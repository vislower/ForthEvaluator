package io.vislower.forth;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ForthEngine {
    
    Deque<Integer> stack;
    private Map<String, ForthWord> forthDictionary;

    public ForthEngine() {
        this.stack = new ArrayDeque<>();
        this.forthDictionary = new HashMap<>(Map.of("+", new Addition(), "-", new Substraction(), "*",
         new Multiplication(), "/", new Division(),
          "dup", new Duplication(), "drop", new Drop(),
           "swap", new Swap(), "over", new Over()));
    }

    public List<Integer> evaluateInput(List<String> input) {

        for (String expression : input) {
            
            String[] command = expression.split(" ");

            // ADD check for new word definition

            for (String word : command) {
                word = word.toLowerCase();
                Integer number = isNumber(word);
                if (number != null) {
                    stack.push(number);
                } else if (forthDictionary.containsKey(word)) {
                    this.forthDictionary.get(word).accept(stack);
                } else {
                    throw new IllegalArgumentException("No definition available for operator ".concat("\"").concat(word).concat("\""));
                }
            }
        }

        return new ArrayList<>(this.stack);
    }

    private Integer isNumber(String s) {
        Integer number;
        try {
            number = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return null;
        }
        return number;
    }
}
