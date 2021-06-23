package com.java.model;

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
