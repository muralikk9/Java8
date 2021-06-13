package com.java.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamFilter {

    private static final Logger logger = LoggerFactory.getLogger(StreamFilter.class);
    public static  int getSum(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(predicate).mapToInt(e -> e).sum();
    }

    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 11).boxed().collect(Collectors.toList());
        logger.info("sum of all numbers: {} " , getSum(list, e -> true));
        logger.info("sum of even numbers: {} " , getSum(list, e -> e % 2 == 0));
        logger.info("sum of odd numbers: {} " , getSum(list, e -> e % 2 == 1));

        int sum = IntStream.range(0,11).filter(e -> e%2 == 0).sum();
        logger.info(String.valueOf(sum));

    }
}
