package EmployeeSalary;

public class AndroidDeveloperSalary implements EmployeeSalary{
    @Override
    public int salary() {
        System.out.println("Getting Salary of Android Developer");
        return 120000;
    }
}
