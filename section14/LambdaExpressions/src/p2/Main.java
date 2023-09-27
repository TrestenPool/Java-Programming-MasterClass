package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        int x = 10;
//        List<String> list = new ArrayList<>(List.of(
//                "alpha", "bravo", "charlie", "delta"
//        ));
//
//        System.out.println("-".repeat(25));
//
//        // multi-line lambda expression to make all the elements in list uppercase
//        String prefix = "nato";
//        list.forEach(mystring -> {
//            int index = list.indexOf(mystring);
//            list.set(index, "%s %s".formatted(prefix, list.get(index).toUpperCase()) );
//        });
//
//        // single line lambda to print all of the elements
//        list.forEach(s -> System.out.println(s));
//
//        var result = calculator( (a,b) ->  a+b, 20, 5);
//        var result2 = calculator( (a,b) ->  a+b, 2.10, 2.10);
//        var result3 = calculator( (a,b) ->  a+b, "Hello", " world");





//        var coordinates = Arrays.asList(
//                new double[]{47.182, -47.123},
//                new double[]{61.222, -77.190},
//                new double[]{12.331, -55.399}
//        );
//
//        // using a variable for the lambda expression for the consumer method
//        BiConsumer<Double, Double> p1 = (lat, lng) -> System.out.printf("[lat:%.3f lon:%.3f]\n", lat, lng);
//        coordinates.forEach(coordinate -> processPoint(coordinate[0], coordinate[1], p1));
//
//        // using a lambda expression for the  consumer method to pass to processPoint
//        coordinates.forEach(coordinate -> processPoint(coordinate[0], coordinate[1], (x,y) -> System.out.printf("[lat:%.3f lon:%.3f]\n", x, y)));

        String[] mystrings = new String[]{"one", "two", "three", "four", "five", "six", "seven"};
        String[] randomSelectedValues = randomlySelectedValues(3, mystrings, () -> new Random().nextInt(7));
        System.out.println(Arrays.toString(randomSelectedValues));

//
//        fire_person( (str) -> str.equals("Tresten") || str.equals("Josh"), mylist);
//        System.out.println(mylist);
    }

    public static String[] randomlySelectedValues(int count,
                                                  String[] values,
                                                  Supplier<Integer> s){
        String[] selectedValues = new String[count];
        for(int i = 0; i < count; i++){
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer){
        consumer.accept(t1, t2);
    }

    public static <T> T calculator(BinaryOperator<T> function, T t1, T t2){
        T result = function.apply(t1, t2);
        System.out.println("result of operation " + result);
        return result;
    }

    public static void fire_person(Predicate<String> fire_person_predicate, List<String> people){
        var iterator = people.iterator();
        while(iterator.hasNext()){
            var person = iterator.next();
            if(fire_person_predicate.test(person)) {
                System.out.println("YOUR FIRED!!! " + person);
                iterator.remove();
            }
        }
    }
}
