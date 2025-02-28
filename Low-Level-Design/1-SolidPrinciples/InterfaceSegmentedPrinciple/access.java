//interfaces should be such that the classes that implement them should not have to implement methods that they don't need.

//PS
public class Access {
    public static void main(String[] args) {
        Viewer v1 = new user();
        v1.view();
        Viewer v2 = new Admin();
        v2.view();
        Editor e1 = new Admin();
        e1.edit();

        Admin a1 = new Admin();
        a1.view();
        a1.edit();
    }
}


interface Viewer {
    void view();
} 

interface Editor {
    void edit();
}

class user implements Viewer{
    @Override
    public void view() {
        System.out.println("Viewing document...");
    }
}

class Admin implements Viewer, Editor{
    @Override
    public void view() {
        System.out.println("Viewing document...");
    }
    @Override
    public void edit() {
        System.out.println("Editing document...");
    }
}


