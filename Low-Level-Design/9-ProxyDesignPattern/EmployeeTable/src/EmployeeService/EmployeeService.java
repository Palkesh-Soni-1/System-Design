package EmployeeService;

public interface EmployeeService {
    void createEmployee(String name) throws Exception;
    void deleteEmployee(String name) throws Exception;
    void updateEmployee(String name) throws Exception;
    void getEmployee(String name) throws Exception;
}