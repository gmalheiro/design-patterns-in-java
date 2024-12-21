package com.designPatterns.adapter.pack.utils;

import com.designPatterns.adapter.pack.PersonAdapter;

import java.util.Objects;

public class PersonProcessor {
    public static void process (PersonAdapter adapter) {
        if (Objects.isNull(adapter.getRegister())){
            System.out.println("Register not informed");
        }
    }
}
