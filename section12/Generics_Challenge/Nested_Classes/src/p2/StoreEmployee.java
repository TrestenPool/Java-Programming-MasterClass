package p2;

import java.util.Comparator;

public class StoreEmployee extends Employee{
    private String storeName;

    // constructor
    public StoreEmployee(String name, String storeName) {
        super(name);
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return super.toString() + "StoreEmployee{" +
                "storeName='" + storeName + '\'' +
                '}';
    }

    public class StoreComparator implements Comparator<StoreEmployee>{
        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            return o1.storeName.compareTo(o2.storeName);
        }
    }

}
