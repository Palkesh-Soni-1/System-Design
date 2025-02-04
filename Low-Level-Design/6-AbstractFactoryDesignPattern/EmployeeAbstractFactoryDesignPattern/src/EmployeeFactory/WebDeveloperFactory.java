package EmployeeFactory;

import Employee.Employee;
import Employee.WebDeveloper;

public class WebDeveloperFactory implements AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
