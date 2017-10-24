package com.akhambir.basics;

import java.util.List;
import java.util.stream.Collectors;

public class Suppliers {

    /*
    * Supplier<T>
    * T get();
    */

    public String doSomething(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() == 5)
                .findFirst()
                .orElseGet(() -> String.format("No result found in %s",
                        strings.stream().collect(Collectors.joining(", "))));
    }

}
