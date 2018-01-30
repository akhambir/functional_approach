package com.akhambir.basics.functions.simple_function;

public class Main {

    public static Function<Integer, Integer> triple = x -> x * 3;

    public static Function<Integer, Integer> square = x -> x * x;

    public static Function<Integer, Integer> compose(Function<Integer, Integer> f1, Function<Integer, Integer>f2) {
        return arg -> f1.apply(f2.apply(arg));
    }



    public static Function<Integer, Function<Integer, Integer>> pureAdd = x -> y -> x + y;

    public static CarryOperator<Integer> add = x -> y -> x + y;

    public static CarryOperator<Integer> mult = x -> y -> x * y;





    public static Function<Function<Integer, Integer>, Function<Function<Integer, Integer>, Function<Integer, Integer>>> pureCompose =
            x -> y -> z -> x.apply(y.apply(z));

    public static CarryOperator<Function<Integer, Integer>> compose = x -> y -> z -> x.apply(y.apply(z));

    public static PolymorphicComposeFunction<Integer, Integer, Integer> compose2 = x -> y -> z -> x.apply(y.apply(z));

    public static void main(String[] args) {

        // apply compose using method
        System.out.println(
                compose(triple, square)
                        .apply(2)
        );

        // apply carrying
        System.out.println(
                add
                        .apply(5)
                        .apply(5)
        );

        // compose using function
        System.out.println(
                compose
                        .apply(triple)
                        .apply(square)
                        .apply(6)
        );

        System.out.println(
                PolymorphicComposeFunction.<Integer, Integer, Integer>higherCompose()
                        .apply(triple)
                        .apply(square)
                        .apply(2)
        );

        System.out.println(
                PolymorphicComposeFunction.<Integer, Integer, Integer>higherAndThan()
                        .apply(square)
                        .apply(triple)
                        .apply(2)
        );

    }

}
