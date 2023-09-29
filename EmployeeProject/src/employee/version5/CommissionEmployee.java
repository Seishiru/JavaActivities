package employee.version5;

import java.util.Date;

public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee() {
        // Default constructor
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
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
        } else if (totalSales >= 50000 && totalSales < 100000) {
            return totalSales * 0.20;
        } else if (totalSales >= 100000 && totalSales < 500000) {
            return totalSales * 0.30;
        } else {
            return totalSales * 0.50;
        }
    }

    // Display employee information
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Salary: $" + computeSalary());
    }

    @Override
    public String getType() {
        return "Commission";
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nDate Hired: " + empDateHired
                + "\nDate of Birth: " + empBirthDate + "\nTotal Sales: $" + totalSales + "\nSalary: $"
                + computeSalary();
    }
}
