package ConvinenceMethod2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Person(String firstname, String lastName){};
public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(
            new Person("Annie", "Apple"),
            new Person("Peter", "Pan"),
            new Person("Peter", "PumpkinEater"),
            new Person("Minnie", "Mouse"),
            new Person("Alan", "Banana"),
            new Person("Mickey", "Mouse")
        ));


        // sort by lastname, if they are equal, sort by firstname too
        list.sort( (o1, o2) -> o1.firstname().compareTo(o2.firstname()));

        // print out list
        list.forEach(System.out::println);

        System.out.println("------------------------------");
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstname));
        list.forEach(System.out::println);
    }
}
