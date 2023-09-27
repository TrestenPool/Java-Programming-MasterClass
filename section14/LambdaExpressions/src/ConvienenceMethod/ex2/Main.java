package ConvienenceMethod.ex2;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> uCase = String::toUpperCase;

        Function<String, String[]> f0 = uCase
                .andThen(s -> s.concat(" Pool"))  // return String
                .andThen(s -> s.split(" "));    // return String[]

        System.out.println(Arrays.toString(f0.apply("Tresten")));

        String[]names = {"Josh", "Dave", "Bob", "Carrol"};
        Consumer<String> s0 = s -> System.out.print(s.charAt(0));
        Consumer<String> s1 = System.out::println;
        Arrays.asList(names).forEach(s0
                .andThen(s -> System.out.print(" - "))
                .andThen(s1)
        );
    }
}
