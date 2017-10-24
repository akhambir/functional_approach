package com.akhambir.basics;

import java.util.List;

public class Transformation {

    public void simpleTransformAndPrintViaLambda(List<String> strings) {
        strings.stream()
                .map(s -> s.length())
                .forEach(x -> System.out.println(x));
    }

    public void simpleTransformAndPrintViaMethodRef(List<String> strings) {
        strings.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
