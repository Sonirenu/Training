package Interface;

//import javax.security.auth.Subject;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String name;
    private Subject subject1;
    private Subject subject2;

    public Student(String name, Subject subject1, Subject subject2) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
    }

    public String getName() {
        return name;
    }

    public Subject getSubject1() {
        return subject1;
    }

    public Subject getSubject2() {
        return subject2;
    }

    public int getTotalMarks() {
        return subject1.getMarks() + subject2.getMarks();
    }

    @Override
    public int compareTo(Student other) {
        int totalMarksThis = this.getTotalMarks();
        int totalMarksOther = other.getTotalMarks();

        // Compare total marks
        if (totalMarksThis < totalMarksOther) {
            return -1;
        } else if (totalMarksThis > totalMarksOther) {
            return 1;
        } else {
            return 0;
        }
    }
}
