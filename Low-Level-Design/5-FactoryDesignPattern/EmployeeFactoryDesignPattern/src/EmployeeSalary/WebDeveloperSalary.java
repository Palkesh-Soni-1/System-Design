package EmployeeSalary;

public class WebDeveloperSalary implements EmployeeSalary{
    @Override
    public int salary() {
        System.out.println("Getting Salary of Web Developer");
        return 100000;
    }
}
