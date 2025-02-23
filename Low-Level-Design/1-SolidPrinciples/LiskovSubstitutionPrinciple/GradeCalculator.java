// Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program

public class GradeCalculator {
    public static void printGrade(Student student, double marks) {
        System.out.println("Student: " + student.getname() +
                ", Grade: " + student.calculateGrade(marks));
    }

    public static void main(String[] args) {
        Student u1 = new Undergraduate("Palkesh");
        Student p1 = new Postgraduate("Soni");
        printGrade(u1, 500);
        printGrade(p1, 300);
    }
}

abstract class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public abstract double calculateGrade(double marks);
}

class Undergraduate extends Student {
    public Undergraduate(String name) {
        super(name);
    }

    @Override
    public double calculateGrade(double marks) {
        return marks / 10;
    }
}

class Postgraduate extends Student {
    public Postgraduate(String name) {
        super(name);
    }

    @Override
    public double calculateGrade(double marks) {
        return marks / 5;
    }
}
