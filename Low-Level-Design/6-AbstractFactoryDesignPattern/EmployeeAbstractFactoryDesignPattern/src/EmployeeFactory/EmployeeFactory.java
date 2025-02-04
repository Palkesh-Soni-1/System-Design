package EmployeeFactory;

import Employee.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(AbstractEmployeeFactory factory){
        return factory.createEmployee();
    }
}
