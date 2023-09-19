package p2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee("Tresten", "Lowes"),
                new StoreEmployee("Jesssica", "Home Depot"),
                new StoreEmployee("Gerald", "Flower pot shop"),
                new StoreEmployee("Tony", "Apple Bees")
        ));


//        StoreEmployee genericEmployee = new StoreEmployee("Jasmine", "TJ-Max");
//        var comparator2 = genericEmployee.new StoreComparator<StoreEmployee>();
//        var comparator = new StoreEmployee("test", "test").new StoreComparator<StoreEmployee>();

//        storeEmployees.sort(compartator);

//        for(var e : storeEmployees){
//            System.out.println(e);
//        }

        A a1 = new A("Tresten");
        a1.printMessage();

    }
}
