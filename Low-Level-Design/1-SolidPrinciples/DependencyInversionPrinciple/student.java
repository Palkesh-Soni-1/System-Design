//PS

public class Student {
    public static void main(String[] args) {
        Course B1 = new Btech();
        Specialization C1 = new Cse();
        Student1 s = new Student1(B1, C1);
        s.study();
        s.special();
    }
}

interface Course {
    public void study();  
}

interface Specialization{
    public void special();
}

class Btech implements Course{
    @Override
    public void study(){
        System.out.println("Btech");
    }
}

class Mtech implements Course{
    @Override
    public void study(){
        System.out.println("Mtech");
    }
}

class Cse implements Specialization{
    @Override
    public void special(){
        System.out.println("Cse");
    }
}

class Ece implements Specialization{
    @Override
    public void special(){
        System.out.println("Ece");
    }
}

class Mech implements Specialization{
    @Override
    public void special(){
        System.out.println("Mech");
    }
}

class Civil implements Specialization{
    @Override
    public void special(){
        System.out.println("Civil");
    }
}

class Student1{
    Course c;
    Specialization s;
    public Student1(Course c, Specialization s){
        this.c = c;
        this.s = s;
    }
    public void study(){
        c.study();
    }
    public void special(){
        s.special();
    }
}
