package employee.version4;

import java.util.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        // Default constructor
    }

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    // Getter and setter for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Compute salary by adding commission on sales to base salary
    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }

    // Display employee information including base salary
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase Salary: $" + baseSalary + "\nTotal Salary: $" + computeSalary();
    }
}
