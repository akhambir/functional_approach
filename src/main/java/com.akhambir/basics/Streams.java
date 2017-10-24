package com.akhambir.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

    }

    public List<Integer> iterateExample() {
        return Stream.iterate(1, n -> n += 1)
                .limit(10)
                .collect(Collectors.toList());
    }

    public long generateExample() {
        return Stream.generate(Math::random)
                .limit(10)
                .count();
    }

}
