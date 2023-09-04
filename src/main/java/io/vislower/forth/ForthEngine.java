package io.vislower.forth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ForthEngine {
    
    private ForthStack stack;
    private Map<String, String> forthDictionary;

    public ForthEngine() {
        this.stack = new ForthStack();
        this.forthDictionary = new HashMap<>();
    }

    public List<Integer> evaluateInput(List<String> input) {

        for (String expression : input) {
            
            String[] command = expression.split(" ");

            for (String word : command) {
                // parse command ...
            }
        }
    }
}
