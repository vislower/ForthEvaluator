package io.vislower.forth;

import java.util.HashMap;
import java.util.Map;

class ForthEngine {
    
    private ForthStack stack;
    private Map<String, String> forthDictionary;

    public ForthEngine() {
        this.stack = new ForthStack();
        this.forthDictionary = new HashMap<>();
    }
}
