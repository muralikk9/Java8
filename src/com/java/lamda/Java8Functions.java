package com.java.lamda;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Java8Functions {
    public static void main(String[] args) {
        ToIntFunction<String> intFunction = Integer::valueOf;
        Function<String, Integer> toInt = Integer::valueOf;
        Function<Integer, String> toString = String::valueOf;
        System.out.println("function output " + intFunction.applyAsInt("2"));
        System.out.println("back to string " + toInt.andThen(toString).apply("2"));

        Predicate<String> predicate = String::isEmpty;
        System.out.println("predicate test " + predicate.test(""));

        Supplier<String> supplier = String::new;
        System.out.println(supplier.get());

        Optional<String> optionalS = Optional.of("abc");
        System.out.println(optionalS.isPresent() + " " + optionalS.get() + " " + optionalS.get());

        UnaryOperator<String> unaryOperator = String::toLowerCase;
        System.out.println(unaryOperator.apply("murali"));

        BinaryOperator<Integer> binaryOperator = (n1, n2) -> n1+n2;
        System.out.println(binaryOperator.apply(1,2));

        Consumer<String> consumer = System.out::println;
        consumer.accept("consumer test");


    }
}
