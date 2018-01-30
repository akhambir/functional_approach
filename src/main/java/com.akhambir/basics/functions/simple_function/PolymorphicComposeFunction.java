package com.akhambir.basics.functions.simple_function;

public interface PolymorphicComposeFunction<T, U, V> extends Function<Function<T, U>, Function<Function<V, T>, Function<V, U>>> {

    static <T, U, V> Function<Function<U, V>, Function<Function<T, U>, Function<T, V>>> higherCompose() {
        return (Function<U, V> f) -> (Function<T, U > g) -> (T x) -> f.apply(g.apply(x));
    }



    static <T, U, V> Function<Function<U, V>, Function<Function<V, T>, Function<U, T>>> higherAndThan() {
        return (Function<U, V> f) -> (Function<V, T> g) -> (U x) -> g.apply(f.apply(x));
    }
}
