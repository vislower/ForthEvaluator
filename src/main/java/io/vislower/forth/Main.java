package io.vislower.forth;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("2 4 * 3 /");

        ForthEvaluator forthEvaluator = new ForthEvaluator();
        System.out.println(forthEvaluator.evaluateProgram(input));
    }
}
