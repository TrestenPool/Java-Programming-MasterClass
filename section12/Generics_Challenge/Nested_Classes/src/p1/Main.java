package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1, "Ralph", 2015),
                new Employee(2, "Carole", 2021),
                new Employee(3, "Jane", 2013),
                new Employee(4, "Laura", 2015),
                new Employee(5, "Tim", 2019)
        ));


        printList(employees);
        employees.sort(new Employee.EmployeeComparator<Employee>("year").reversed());
        printList(employees);
    }

    public static void printList(List<Employee> employees){
        for(var e : employees){
            System.out.println(e);
        }
        System.out.println();
    }
}