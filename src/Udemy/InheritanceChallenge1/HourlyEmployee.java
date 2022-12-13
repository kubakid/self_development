package Udemy.InheritanceChallenge1;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(long employeeId, String hireDate, double hourlyPayRate) {
        super(employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getDoublePay(){
        return hourlyPayRate *2;
    }

    public HourlyEmployee(long employeeId, String hireDate) {
        super(employeeId, hireDate);
    }

    public HourlyEmployee(){

    }
}
