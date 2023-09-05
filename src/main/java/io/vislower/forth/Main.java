package io.vislower.forth;

import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<String> input = Arrays.asList(": SWAP DUP Dup dup ;", "1 swap");

        ForthEvaluator forthEvaluator = new ForthEvaluator();
        System.out.println(forthEvaluator.evaluateProgram(input));
    }
}
