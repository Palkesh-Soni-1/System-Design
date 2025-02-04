import Employee.Employee;
import EmployeeFactory.EmployeeFactory;
import EmployeeFactory.AndroidDeveloperFactory;
public class App {
    public static void main(String[] args){
        Employee employee= EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        employee.greet();
        System.out.println("Salary: "+employee.employeeSalary.salary());
    }
}
