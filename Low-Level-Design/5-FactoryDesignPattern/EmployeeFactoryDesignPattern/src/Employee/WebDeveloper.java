package Employee;
import EmployeeSalary.EmployeeSalary;
import EmployeeSalary.WebDeveloperSalary;
public class WebDeveloper extends Employee{
    public WebDeveloper(){
        this.employeeSalary=new WebDeveloperSalary();
    }

    @Override
    public void greet() {
        System.out.println("Hello! I am Web Developer.");
    }
}
