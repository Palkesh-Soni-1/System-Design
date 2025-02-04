package EmployeeFactory;

import Employee.Employee;
import Employee.AndroidDeveloper;
public class AndroidDeveloperFactory implements AbstractEmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
