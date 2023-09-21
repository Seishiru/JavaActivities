package employee.version1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee() {
        // Default constructor
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate); // Call the superclass constructor
        this.totalSales = totalSales;
    }
    
    // Getters and setters for totalSales
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    // Compute salary based on total sales
    public double computeSalary() {
        if (totalSales < 50000) {
            return totalSales * 0.05;
        } else if (totalSales < 100000) {
            return totalSales * 0.20;
        } else if (totalSales < 500000) {
            return totalSales * 0.30;
        } else {
            return totalSales * 0.50;
        }
    }

    // Display employee information specific to CommissionEmployee
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Date Hired: " + dateFormat.format(getEmpDateHired()));
        System.out.println("Date of Birth: " + dateFormat.format(getEmpBirthDate()));
        System.out.println("Total Sales: ₱" + totalSales);
        System.out.println("Salary: ₱" + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: $" + totalSales + "\nSalary: $" + computeSalary();
    }
}
