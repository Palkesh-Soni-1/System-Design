package EmployeeService;

public class EmployeeServiceProxy implements EmployeeService {
    private EmployeeServiceImpl employeeService;
    private String userRole;

    public EmployeeServiceProxy(String userRole) {
        this.employeeService = new EmployeeServiceImpl();
        this.userRole = userRole;
    }

    @Override
    public void createEmployee(String name) throws Exception {
        if (userRole.equals("admin")) {
            employeeService.createEmployee(name);
        } else {
            throw new Exception("Access Denied: Only admin can create employees.");
        }
    }

    @Override
    public void deleteEmployee(String name) throws Exception {
        if (userRole.equals("admin")) {
            employeeService.deleteEmployee(name);
        } else {
            throw new Exception("Access Denied: Only admin can delete employees.");
        }
    }

    @Override
    public void updateEmployee(String name) throws Exception {
        if (userRole.equals("admin")) {
            employeeService.updateEmployee(name);
        } else {
            throw new Exception("Access Denied: Only admin can update employees.");
        }
    }

    @Override
    public void getEmployee(String name) throws Exception {
        employeeService.getEmployee(name);
    }
}
