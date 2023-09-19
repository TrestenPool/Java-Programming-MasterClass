package p1;

import java.util.Comparator;

public class Employee {

    // static class
    public static class EmployeeComparator<T extends  Employee> implements Comparator<Employee>{
        private String sortType;
        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        public EmployeeComparator() {
           this("name");
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            switch (this.sortType){
                case "name" -> {
                    return o1.name.compareTo(o2.name);
                }
                case "year" -> {
                    return o1.yearStarted - o2.yearStarted;
                }
                default -> {
                    return o1.id - o2.id;
                }
            }
        }
    }
    
    private int id;
    private String name;
    private int yearStarted;


    public Employee() {
    }


    public Employee(int id, String name, int yearStarted) {
        this.id = id;
        this.name = name;
        this.yearStarted = yearStarted;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "%d %-8s %d".formatted(this.id, this.name, this.yearStarted);
    }

}
