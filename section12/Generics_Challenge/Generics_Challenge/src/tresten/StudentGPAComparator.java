package tresten;

import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (String.valueOf(o1.gpa)).compareTo(String.valueOf(o2.gpa));
    }

}
