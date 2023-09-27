package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    // static nested class
    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Mickey", "Mouse"), // just to show you we can use this syntax because the record is a static nested class
                new Person("Minnie", "Mouse"), // just to show you we can use this syntax because the record is a static nested class
                new Person("Donald", "Duck"),
                new Person("Abby", "Duck"),
                new Person("Brian", "Duck"),
                new Person("Goofy", "Mcman"),
                new Person("Hubert", "Jensen")
        ));

        // sort by the firstname
//        people.sort( (o1, o2) -> o1.firstName.compareTo(o2.firstName) );

        // print the people
//        for(var person : people){
//            System.out.println(person);
//        }

        // Comparator interface that extends Comparator
        interface EnhancedComparator<T> extends Comparator<T>{
            int secondLevel(T o1, T o2);
        }

        // concrete class for the above interface
        var comparatorMixed = new EnhancedComparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName.compareTo(o2.lastName);
                return (result == 0) ? secondLevel(o1, o2) : result; // if the last names are the same, match by the first name too, the second level
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };

//        people.sort(comparatorMixed);
        people.sort( (x1, x2) -> x1.firstName.compareTo(x2.firstName) );
        System.out.println(people);

    }
}
