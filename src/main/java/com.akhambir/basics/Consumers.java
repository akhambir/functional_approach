package com.akhambir.basics;

import java.util.List;

public class Consumers {

    /*
    * Consumer<T>
    * void accept(T t);
    */

    public void printString(List<String> strings) {
        strings.forEach(System.out::println);
    }

}
