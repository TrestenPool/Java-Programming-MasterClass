package mini_challenges;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        // mini challenge 1
       Consumer<String> consumer = (message) -> {
           String[] parts = message.split(" ");
           Arrays.asList(parts).forEach(s -> System.out.println(s));
       };
       consumer.accept("Hello world, nice to see you");


       // mini challenge 2
        UnaryOperator<String> unaryOperator = (source) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < source.length(); i++){
                if (i % 2 == 0) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(unaryOperator.apply("Hello mate, how are you?"));


    }
}
