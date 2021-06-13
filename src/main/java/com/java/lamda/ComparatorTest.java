package com.java.lamda;

import com.java.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;

public class ComparatorTest {
    private static final Logger logger = LoggerFactory.getLogger(ComparatorTest.class);
    public static void main(String[] args) {
        Comparator<Person> comparator = (a, b) -> a.getFirstName().compareTo(b.getLastName());
        Person p1 = new Person("abc", "cde");
        Person p2 = new Person("cde", "def");
        int result = comparator.compare(p1, p2);
        logger.info("result : {}"  , result);
    }
}
