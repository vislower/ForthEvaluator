package io.vislower.forth;

import java.util.Deque;

class UserWord implements ForthWord {

    private String[] definition;
    private String wordDefinition;

    public UserWord(String[] definition) {
        checkDefinition(definition);
        this.definition = definition;
        
        StringBuilder def = new StringBuilder();
        for (int i = 2; i < definition.length - 1; i++) {
            def.append(definition[i]);
        }
        this.wordDefinition = def.toString();
    }

    @Override
    public void accept(Deque<Integer> stack) {
        
    }

    private void checkDefinition(String[] definition) {
        if (ForthEngine.isNumber(definition[1]) != null) {
            throw new IllegalArgumentException("Cannot redefine numbers");
        }
    }
    
}
