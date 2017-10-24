package com.akhambir.basics;

import java.util.List;
import java.util.stream.Collectors;

public class Functions {

    /*
    * Function<T, R>
    * R apply(T t);
    */

    public List<Integer> getLengthFromStrings(List<String> strings) {
        return strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
    }

}
