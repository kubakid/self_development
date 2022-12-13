package Udemy.InheritanceChallenge1;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public SalariedEmployee(long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee() {
    }

    public void retire(){
        isRetired = true;
    }
}
