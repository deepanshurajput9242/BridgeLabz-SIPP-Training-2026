package oops_practice.Scenerio_based;

class Person {

    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Age = " + age;
    }
}

class Student extends Person {

    // Immutable studentId
    private final int studentId;
    protected double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);   // Constructor chaining
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID = " + studentId +
                ", GPA = " + gpa;
    }
}

class GradStudent extends Student {

    private String thesis;

    GradStudent(String name, int age, int studentId,
                double gpa, String thesis) {

        super(name, age, studentId, gpa); // Constructor chaining
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Thesis = " + thesis;
    }
}

public class Day12_Scenerio {

    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Rahul Sharma",
                24,
                101,
                9.1,
                "Artificial Intelligence in Education"
        );

        // Printing complete details
        System.out.println(gs);

        // Demonstrating IS-A relationship
        Person p = gs;      // GradStudent IS-A Person
        Student s = gs;     // GradStudent IS-A Student

        System.out.println("\nIS-A Relationship Demonstration:");

        if (gs instanceof Student)
            System.out.println("GradStudent IS-A Student");

        if (gs instanceof Person)
            System.out.println("GradStudent IS-A Person");

        if (s instanceof Person)
            System.out.println("Student IS-A Person");

        // Polymorphism
        System.out.println("\nUsing Person reference:");
        System.out.println(p);
    }
}