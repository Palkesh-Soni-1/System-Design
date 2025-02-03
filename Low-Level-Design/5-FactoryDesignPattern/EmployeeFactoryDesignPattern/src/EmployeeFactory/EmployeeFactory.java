package EmployeeFactory;

import Employee.Employee;
import Employee.AndroidDeveloper;
import Employee.WebDeveloper;

public class EmployeeFactory {
    public static Employee getEmployeeByType(String empType){
        empType= empType.trim();
        if(empType.equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        }
        else if(empType.equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }
        return null;
    }
}
