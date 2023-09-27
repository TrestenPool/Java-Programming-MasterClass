package ConvienenceMethod;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String name = "Tresten";
        Function<String, String> uCase = String::toUpperCase;
        System.out.println(uCase.apply(name));

        Function<String, String> lastName = (s) -> s.concat(" Pool");

        // chaining
        Function<String,String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));


        // input the lastname before capitlizing the all
        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));


    }
}
