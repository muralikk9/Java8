package com.java.misc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Customer {
    private Integer id;
    private String name;
    private List<Integer> phoneNumbers;
}
