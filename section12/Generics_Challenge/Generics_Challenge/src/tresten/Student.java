package tresten;

import java.util.Random;

public class Student implements Comparable<Student> {
    // field
    String name;
    private int id;
    protected double gpa;

    // static fields
    private static int LAST_ID = 1000;
    private static Random random = new Random();

    // constructor
    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public int compareTo(Student other_student) {
        // casts to Integer and uses the Integer.compareTo() method
        return Integer.valueOf(id)
                .compareTo( Integer.valueOf(other_student.id) );
    }

    @Override
    public String toString() {
        return String.format("%s, ID:%d GPA:%.2f", this.name, this.id, this.gpa);
    }

}
