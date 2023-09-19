package Ex2;

import java.util.Random;

public class Student {
    private String name;
    private String course;
    private int yearStarted;

    // static random object
    protected static Random random = new Random();

    // static array of possible values
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};


    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        this.name = firstNames[random.nextInt(5)] + " " + (char)lastNameIndex;
        this.course = courses[random.nextInt(3)];
        this.yearStarted = random.nextInt(2018, 2023);
    }

    @Override
    public String toString() {
        return "%-15s enrolled in %-15s since %d".formatted(name, course, yearStarted);
    }


    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }
}
