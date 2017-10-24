package com.akhambir.basics;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparing {

    public List<String> compareUsingLambda(List<String> strings) {
        return strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());
    }

    public List<String> compareUsingMethodRef(List<String> strings) {
        return strings.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    public List<String> sortByLengthAndLex(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))           //static interface method call example
                .collect(Collectors.toList());
    }
}
