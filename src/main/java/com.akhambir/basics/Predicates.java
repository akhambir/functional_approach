package com.akhambir.basics;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates {

    /*
    * Predicate<T>
    * boolean test(T t);
    */

    private static final Predicate<String> LENGTH_FIVE = s -> s.length() == 5;
    private static final Predicate<String> STARTS_WITH_S = s -> s.startsWith("S");

    public List<String> getNamesByCondition(List<String> strings) {
        return strings.stream()
                .filter(LENGTH_FIVE.and(STARTS_WITH_S))
                .collect(Collectors.toList());
    }
}
