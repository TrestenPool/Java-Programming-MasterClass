package challenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Tresten", "Pool", "01/29/1999"),
                new Employee("Josh", "Allen", "04/23/1995"),
                new Employee("Kim", "Possible", "06/12/2003")
        ));

        method1(employees);

    }

    public static void method1(List<Employee> employees){
        int currentYear = LocalDate.now().getYear();
        class MyEmployee{
            Employee containedEmployee;
            int yearsWorked;
            String fullName;
            public MyEmployee(Employee employee) {
                this.containedEmployee = employee;
                this.yearsWorked = currentYear - Integer.parseInt(employee.hireDate().split("/")[2]);
                this.fullName = String.join(",", employee.firstName(), employee.lastName());
            }
            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName, yearsWorked);
            }
        }
        List<MyEmployee> myEmployeeList = new ArrayList<>();
        for(var emp : employees){
            myEmployeeList.add(new MyEmployee(emp));
        }
        var comparator = new Comparator<MyEmployee>(){
            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                return o1.fullName.compareTo(o2.fullName);
            }
        };
        myEmployeeList.sort(comparator);
        System.out.println(myEmployeeList);
    }

}
