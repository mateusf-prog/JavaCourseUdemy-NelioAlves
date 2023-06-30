package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 6, 8, 7);

        // create a Stream 'st1' with the list
        Stream<Integer> st1 = list.stream();

        // convert stream to vector and printing
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<Integer> st2 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st2.toArray()));

        // create Stream 'st3' passing the values directly
        Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st3.toArray()));

        // create Stream 'st4' that (value, iteration)
        Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

        // create Stream 'st5' that storing the sequence the fibonacci
        Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st5.limit(10).toArray()));

    }
}