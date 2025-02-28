import EmployeeService.EmployeeService;
import EmployeeService.EmployeeServiceProxy;
public class App {
    public static void main(String[] args) throws Exception {
        try {
            EmployeeService adminProxy = new EmployeeServiceProxy("admin");
            EmployeeService clientProxy = new EmployeeServiceProxy("client");

            System.out.println("Admin trying operations:");
            adminProxy.createEmployee("Satyam");
            adminProxy.getEmployee("Satyam");
            adminProxy.updateEmployee("Satyam");
            adminProxy.deleteEmployee("Satyam");

            System.out.println("\nClient trying operations:");
            clientProxy.getEmployee("Suyash");
            clientProxy.createEmployee("Suyash");
            clientProxy.updateEmployee("Suyash");
            clientProxy.deleteEmployee("Suyash");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
