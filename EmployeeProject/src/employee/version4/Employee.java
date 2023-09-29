package employee.version4;

import java.util.Date;

public class Employee {
    protected int empID;
    protected String empName;
    protected Date empBirthDate;
    protected Date empDateHired;
    protected String type;

    public Employee() {
        // Default constructor
    }

    public Employee(int empID, String empName, Date empDateHired, Date empBirthDate) {
    this.empID = empID;
    this.empName = empName;
    this.empDateHired = empDateHired;
    this.empBirthDate = empBirthDate;
    //this.type = type;
}

    public String getType() {
        return type;
    }

    public double computeSalary() {
        return 0.0;
    }
    // Getters and setters for the protected fields
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName;
    }

    // Common methods for all employees
    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
    }
    // Add other common methods as needed
}
