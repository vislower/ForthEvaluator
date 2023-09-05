package io.vislower.forth;

import java.util.Deque;
import java.util.Map;

class UserWord implements ForthWord {

    private String[] definition;
    private String wordDefinition;
    private Map<String, ForthWord> forthDictionary;

    public UserWord(String[] definition, Map<String, ForthWord> forthDictionary) {
        checkDefinition(definition);
        this.definition = definition;
        this.forthDictionary = forthDictionary;

        buildDefinition(); // replace previously defined words by their definition in the current definition

        StringBuilder tmp = new StringBuilder();
        for (int i = 2; i < this.definition.length - 1; i++) {
            tmp.append(this.definition[i]);
            tmp.append(" ");
        }

        tmp.deleteCharAt(tmp.length() - 1); // delete last space
        this.wordDefinition = tmp.toString();
    }

    @Override
    public void accept(Deque<Integer> stack) {
        for (int i = 2; i < definition.length - 1; i++) {
            ForthEngine.execute(definition[i].toLowerCase(), stack, this.forthDictionary);
        }
    }

    private void checkDefinition(String[] definition) {
        if (ForthEngine.isNumber(definition[1]) != null) {
            throw new IllegalArgumentException("Cannot redefine numbers");
        }
    }

    private void buildDefinition() {
        for (int i = 2; i < this.definition.length - 1; i++) {
            if (this.forthDictionary.containsKey(this.definition[i]) && this.forthDictionary.get(this.definition[i]).getClass().equals(UserWord.class)) {
                this.definition[i] = ((UserWord)this.forthDictionary.get(this.definition[i])).wordDefinition;
            }
        }
    }
    
}
