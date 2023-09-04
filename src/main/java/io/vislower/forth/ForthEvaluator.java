package io.vislower.forth;

import java.util.Collections;
import java.util.List;


class ForthEvaluator {

    private ForthEngine forthEngine;

    public ForthEvaluator() {
        this.forthEngine = new ForthEngine();
    }

    List<Integer> evaluateProgram(List<String> input) {
        List<Integer> result = this.forthEngine.evaluateInput(input);
        Collections.reverse(result);
        return result;
    }
}
