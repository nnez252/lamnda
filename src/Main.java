import java.util.Objects;

import static java.lang.Double.valueOf;


interface Predicate<T> {
    boolean test(T t);
}

interface Consumer<T> {
    void accept(T t);
}
interface Function<T, R> {
    R apply(T t);
}
@FunctionalInterface
interface Supplier<T> {
    T get();
}

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> number = x -> x > 0;
        System.out.println(number.test(10));


        Consumer<String> name = x -> System.out.println("Hello " + x);
        name.accept("Elena");


        Function<Long, Double> numbers = x -> Double.valueOf(Long.valueOf(x));
        System.out.println(numbers.apply((long) 23323232.32d));


        Supplier<Integer> randomnumber = () -> (int) (Math.random() * 100);
        System.out.println(randomnumber.get());



        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

        System.out.println(safeStringLength);





    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}
