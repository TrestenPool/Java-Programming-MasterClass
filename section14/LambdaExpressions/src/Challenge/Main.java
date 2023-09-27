package Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    // static random generator
    private static Random random = new Random();

    public static void main(String[] args) {
        String[] firstNames = new String[]{
                "Tresten", "Briana", "Kim", "Anna", "Timmy", "Josh", "Dave", "Quin"
        };
        Arrays.setAll(firstNames, i -> firstNames[i].toUpperCase());
        List<String> backedByArray = Arrays.asList(firstNames);
        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'Z') + ".");

        System.out.println("--- Added middle initial ---");
        System.out.println(Arrays.toString(firstNames));

        System.out.println("--- Added reverse name ---");
        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        System.out.println(Arrays.toString(firstNames));

        backedByArray.forEach(System.out::println);
    }

    public static char getRandomChar(char startChar, char endChar){
        int lowerbound = (int)startChar;
        int upperbound = (int)endChar;
        return (char) random.nextInt(lowerbound, upperbound+1);
    }
    public static String getReversedName(String inputString){
        return new StringBuilder(inputString).reverse().toString();
    }
}
