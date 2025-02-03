import Employee.Employee;
import Employee.AndroidDeveloper;
import EmployeeFactory.EmployeeFactory;
public class App {
    public static void main(String[] args) throws Exception {

//        Employee employee=new AndroidDeveloper();
//        employee.greet();
//        System.out.println("Salary: "+employee.employeeSalary.salary());

        Employee employee = EmployeeFactory.getEmployeeByType("ANDROID DEVELOPER");
        employee.greet();
        System.out.println("Salary: "+employee.employeeSalary.salary());

    }
}
