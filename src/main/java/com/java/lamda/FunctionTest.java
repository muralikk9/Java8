package com.java.lamda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionTest {
    private static final Logger logger = LoggerFactory.getLogger(FunctionTest.class);


    private static void printIt(int num, String operation, Function<Integer, Integer> function) {
        logger.info(num + " " + operation + " " + function.apply(num));
    }
    public static void main(String[] args) {
        UnaryOperator<Integer> doubleTo = e -> e*2;
        UnaryOperator<Integer> incrementTo = e -> e+2;
        printIt(5, "increment", incrementTo);
        printIt(5, "increment", incrementTo);
        printIt(5, "double", doubleTo);
        printIt(5, "inrementAndDouble", incrementTo.andThen(incrementTo));
    }
}
