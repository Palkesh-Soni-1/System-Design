package EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void createEmployee(String name) {
        System.out.println("Employee " + name + " created.");
    }

    @Override
    public void deleteEmployee(String name) {
        System.out.println("Employee " + name + " deleted.");
    }

    @Override
    public void updateEmployee(String name) {
        System.out.println("Employee " + name + " updated.");
    }

    @Override
    public void getEmployee(String name) {
        System.out.println("Fetching details for employee: " + name);
    }
}
