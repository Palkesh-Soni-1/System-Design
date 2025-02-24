//interfaces should be such that the classes that implement them should not have to implement methods that they don't need.

//PS
public class access {
    public static void main(String[] args) {
        viewer v1 = new user();
        v1.view();
        viewer v2 = new admin();
        v2.view();
        editor e1 = new admin();
        e1.edit();

        admin a1 = new admin();
        a1.view();
        a1.edit();
    }
}


interface viewer {
    void view();
} 

interface editor {
    void edit();
}

class user implements viewer{
    @Override
    public void view() {
        System.out.println("Viewing document...");
    }
}

class admin implements viewer, editor{
    @Override
    public void view() {
        System.out.println("Viewing document...");
    }
    @Override
    public void edit() {
        System.out.println("Editing document...");
    }
}


