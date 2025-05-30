package pl.pp;
import java.util.*;

class Student {
    private String index;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    public Student(String index, String firstName, String lastName, List<Integer> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getIndex() {
        return index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s) – Average: %.2f",
                firstName, lastName, index, getAverageGrade());
    }
}

public class myEleventhApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        Student topStudent = Collections.max(students, Comparator.comparingDouble(Student::getAverageGrade));
        System.out.printf("Student with the highest average: %s%n%n", topStudent);
        students.sort(Comparator.comparing(Student::getLastName));

        System.out.println("Students sorted by last names:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}