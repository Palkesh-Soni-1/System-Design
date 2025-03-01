// Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program

// Analogy - Student shouldn't teach and teacher shouldn't be learning in the classroom.

import java.util.ArrayList;
import java.util.List;

public class ClassRoom{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Yagyesh Goyal");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Palkesh Soni"));
        students.add(new Student("Satyam Gupta"));
        students.add(new Student("Suyash"));

        teacher.teach();

        for (Student student : students) {
            student.learn();
        }
    }
};

// Person class (superclass)
class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // It should not have teach() or learn() abstractions!
}

// Teacher class (subclass of Person)
class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    public void teach() {
        System.out.println(getName() + " is teaching.");
    }
}

// Student class (subclass of Person)
class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public void learn() {
        System.out.println(getName() + " is learning.");
    }
}