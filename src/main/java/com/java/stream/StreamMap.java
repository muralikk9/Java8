package com.java.stream;

import com.java.misc.Customer;
import com.java.model.Person;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class StreamMap {
    public static void main(String[] args) {
        Map<Person, Integer> personMap = new HashMap<>();
        personMap.put(new Person("cde", "def"), 60);
        personMap.put(new Person("abc", "bcd"), 90);
        personMap.put(new Person("def", "efg"), 40);

        List<String> firstNamesList = personMap.entrySet().stream().map(i -> i.getKey().getFirstName()).collect(Collectors.toList());
        firstNamesList.stream().forEach(i -> log.info("first name={}", i));

        Map<Integer, Customer> customerMap = new HashMap<>();
        customerMap.put(2, new Customer(2, "abc", Arrays.asList(121231, 213213)));
        customerMap.put(1, new Customer(1, "bcd", Arrays.asList(221231, 313213)));
        customerMap.put(3, new Customer(3, "cde", Arrays.asList(421231, 513213)));

        customerMap.entrySet().stream().flatMap(c -> c.getValue().getPhoneNumbers().stream()).forEach(i -> log.info("customer numbers={}", i));

    }
}
