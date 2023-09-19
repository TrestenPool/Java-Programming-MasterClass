package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // regular students
//        int studentCount = 10;
//        List<Student> students = new ArrayList<>();
//        for(int i = 0; i < studentCount; i++){
//            students.add(new Student());
//        }
//        students.add(new LPAStudent()); // we can add an lps student to the List<Student>
//        printMoreList(students);
//
//        // lpa students
//        int lpaStudentCount = 10;
//        List<LPAStudent> lpaStudents = new ArrayList<>();
//        for(int i = 0; i < lpaStudentCount; i++){
//            lpaStudents.add(new LPAStudent());
//        }
//        printMoreList(lpaStudents); // this gives compiler error because LPAStudent doesn't inherit from the Student class

        A a = new A(32);
        A.B b = new A.B("secret");


    }

//    public static <T extends Student> void printList(List<T> students){
//        for (var student : students){
//            System.out.println(student);
//        }
//        System.out.println();
//    }

//    public static void printMoreList(List<? extends Student> students){
//
//        // assigning the first element in the students list to the last student in the list
//        Student last = students.get(students.size()-1);
//        students.set(0, last); // COMPILE-TIME ERROR: Required type : "capture of ? extends Student" Provided: "Student"
//
//        for (var student : students){
//            System.out.println( student);
//        }
//        System.out.println();
//    }


    public static void testList(List<Integer> list){
        for(var element : list){
            System.out.println("Integer: " + element.floatValue());
        }
    }

//    public static void testList(List<?> list){
//        for(var element: list){
//            if(element instanceof Integer){
//                System.out.println(((Integer) element).floatValue());
//            }
//            else if (element instanceof String) {
//                System.out.println(((String) element).toUpperCase());
//            }
//        }
//    }

}
