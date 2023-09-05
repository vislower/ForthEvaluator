package io.vislower.forth;

import java.util.Deque;
import java.util.Map;

class UserWord implements ForthWord {

    private String[] definition;
    private Map<String, ForthWord> forthDictionary;

    public UserWord(String[] definition, Map<String, ForthWord> forthDictionary) {
        checkDefinition(definition);
        this.definition = definition;
        this.forthDictionary = forthDictionary;
    }

    @Override
    public void accept(Deque<Integer> stack) {
        for (int i = 2; i < definition.length - 1; i++) {
            ForthEngine.execute(definition[i], stack, this.forthDictionary);
        }
    }

    private void checkDefinition(String[] definition) {
        if (ForthEngine.isNumber(definition[1]) != null) {
            throw new IllegalArgumentException("Cannot redefine numbers");
        }
    }
    
}
