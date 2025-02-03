package Employee;
import EmployeeSalary.AndroidDeveloperSalary;
public class AndroidDeveloper extends Employee{
    public AndroidDeveloper(){
        this.employeeSalary=new AndroidDeveloperSalary();
    }

    @Override
    public void greet() {
        System.out.println("Hello! I am Android Developer.");
    }
}
