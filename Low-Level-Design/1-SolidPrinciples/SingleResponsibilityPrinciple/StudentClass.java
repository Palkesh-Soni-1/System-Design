// A class should have only 1 reason to change
public class StudentClass {
    public static void main(String[] args) {
        //subjects->3
        Student s1 = new Student("Palkesh Soni", "palkesh@gmail.com", new int[] { 90, 80, 70 });
        s1.getname();
        s1.getemail();
        s1.getmarks();
        ChangeName c = new ChangeName(s1, "Palkesh");
        s1.getname();
        ChangeEmail e = new ChangeEmail(s1, "soni@gmail.com");
        s1.getemail();
        ChangeMarks m = new ChangeMarks(s1, new int[] { 100, 90, 80 });
        s1.getmarks();
        calculateTotal t = new calculateTotal(s1);
        calculatePercentage p = new calculatePercentage(s1);
    }

}

//create a class for student
class Student {
    String name;
    String email;
    int[] marks;

    public Student(String name, String email, int[] marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
        System.out.println(name + " " + "register successfully");
    }

    public void getname() {
        System.out.println("Name: " + name);
    }

    public void getemail() {
        System.out.println("Email: " + email);
    }

    public void getmarks() {
        for(int i=0;i<marks.length;i++){
            System.out.println("Marks "+(i+1)+" :"+ marks[i]);
        }
    }
}



class ChangeName{
    Student s;
    public ChangeName(Student s, String name){
        String oldname = s.name;
        s.name = name;
        System.out.println("Name changed successfully from "+oldname+" to "+name);
    }
}
class ChangeEmail{
    Student s;
    public ChangeEmail(Student s, String email){
        String oldemail = s.email;
        s.email = email;
        System.out.println("Email changed successfully from "+oldemail+" to "+email);
    }
}

class ChangeMarks{
    Student s;
    public ChangeMarks(Student s, int[] marks){
        for(int i=0;i<s.marks.length;i++){
            s.marks[i] = marks[i];
        }
        System.out.println("Marks changed successfully");
    }
}

class calculateTotal{
    Student s;
    public calculateTotal(Student s){
        int total = 0;
        for(int i=0;i<s.marks.length;i++){
            total += s.marks[i];
        }
        System.out.println("Total marks: "+total);
    }
}

class calculatePercentage{
    Student s;
    public calculatePercentage(Student s){
        int total = 0;
        for(int i=0;i<s.marks.length;i++){
            total += s.marks[i];
        }
        System.out.println("Percentage: "+total/s.marks.length);
    }
}