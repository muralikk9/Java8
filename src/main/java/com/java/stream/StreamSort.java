package com.java.stream;

import com.java.model.Person;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class StreamSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,8,7,5,6,3,2);
        list.stream().sorted(Comparator.reverseOrder()).forEach(i -> log.info("{}", i));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("cde", "def"));
        personList.add(new Person("abc", "bcd"));
        personList.add(new Person("def", "efg"));

        personList.stream().sorted(Comparator.comparing(Person::getFirstName)).forEach(i -> log.info("{}", i));


        Map<Integer, String> map = new HashMap<>();
        map.put(4,"d");
        map.put(2,"c");
        map.put(9,"b");
        map.put(8,"a");
        map.put(7,"e");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(i -> log.info("{}", i));
        log.info("{}", "-----------");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(i -> log.info("{}", i));

        Map<Person, Integer> personMap = new HashMap<>();
        personMap.put(new Person("cde", "def"), 60);
        personMap.put(new Person("abc", "bcd"), 90);
        personMap.put(new Person("def", "efg"), 40);
        personMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Person::getFirstName))).forEach(i -> log.info("{}", i));
        log.info("{}", "sorting by value");
        personMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(i -> log.info("{}", i));



    }
}
