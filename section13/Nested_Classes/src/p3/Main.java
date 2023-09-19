package p3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>(List.of(
                new Cat("Mittens", "white", 10),
                new Cat("Abstinence", "calicio", 5),
                new Cat("Stealthy", "Brown", 2)
        ));

        List<Dog> dogList = new ArrayList<>(List.of(
                new Dog("Clifford", "red", true),
                new Dog("Rex", "brown", false),
                new Dog("Bk", "black", true)
        ));
        
        var comp = new Comparator<Mammal>(){
            @Override
            public int compare(Mammal o1, Mammal o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

//        sortIt(catList, new MammalComparator<Cat>());
        sortIt(catList, comp);
        sortIt(dogList, new MammalComparator<Dog>());
    }

    public static <T> void sortIt(List<T> list,
                                  Comparator<? super T> comparator){
        System.out.println("sorting with Comparator " + comparator);
        list.sort(comparator);
        for(var el: list){
            System.out.println(el);
        }
        System.out.println();
    }
}
