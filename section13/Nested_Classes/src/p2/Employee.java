package p2;

public class Employee {
    private int id;
    private String name;
    private static int ID_GENERATOR = 1000;


    // constructor
    public Employee(String name) {
        this.name = name;
        this.id = ID_GENERATOR++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
