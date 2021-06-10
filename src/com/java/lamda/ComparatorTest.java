package com.java.lamda;

import com.java.model.Person;

import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Comparator<Person> comparator = (a, b) -> a.getFirstName().compareTo(b.getLastName());
        Person p1 = new Person("abc", "cde");
        Person p2 = new Person("cde", "def");
        comparator.compare(p1, p2);
    }
}
