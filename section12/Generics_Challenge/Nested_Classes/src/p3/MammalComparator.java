package p3;

import java.util.Comparator;

public class MammalComparator<T extends Mammal> implements Comparator<T> {
    @Override
    public int compare(Mammal o1, Mammal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
