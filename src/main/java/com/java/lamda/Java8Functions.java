package com.java.lamda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Java8Functions {
    private static final Logger logger = LoggerFactory.getLogger(Java8Functions.class);
    public static void main(String[] args) {
        ToIntFunction<String> intFunction = Integer::valueOf;
        Function<String, Integer> toInt = Integer::valueOf;
        Function<Integer, String> toString = String::valueOf;
        logger.info("function output: {} " , intFunction.applyAsInt("2"));
        logger.info("back to string: {} " , toInt.andThen(toString).apply("2"));

        Predicate<String> predicate = String::isEmpty;
        logger.info("predicate test: {}" , predicate.test(""));

        Supplier<String> supplier = String::new;
        logger.info(supplier.get());

        Optional<String> optionalS = Optional.of("abc");
        logger.info("isPresent: {}, value:{}" ,optionalS.isPresent(), optionalS.get());

        UnaryOperator<String> unaryOperator = String::toLowerCase;
        logger.info(unaryOperator.apply("murali"));

        IntBinaryOperator binaryOperator = Integer::sum;
        logger.info("{}", binaryOperator.applyAsInt(1,2));

        Consumer<String> consumer = logger::info;
        consumer.accept("consumer test");


    }
}
