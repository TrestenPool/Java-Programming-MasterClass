package MethodReferenceChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
        String[] names = new String[]{"Anna", "Bob", "Cameron", "Donald", "Eva", "Francis"};

        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase, String::toLowerCase
        ));

        applyChanges(names, list);
    }

    private static void applyChanges(String[] names,
                                     List<UnaryOperator<String>> stringFunctions){
        List<String> backedByArray = Arrays.asList(names);

        for(var func : stringFunctions){
            backedByArray.replaceAll(s -> s.transform(func));
            System.out.println(Arrays.toString(names));
        }

    }
}
