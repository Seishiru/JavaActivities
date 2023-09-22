package employee.version2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;
    // Constructor 1: Default constructor
    public HourlyEmployee() {
    }

    // Constructor 2: Parameterized constructor with basic employee information
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    // Constructor 3: Parameterized constructor with all employee information
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate,
                         float totalHoursWorked, float ratePerHour) {
        this(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    // Accessors and Mutators
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

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    // Compute Salary
    public double computeSalary() {
        double regularHours = Math.min(totalHoursWorked, 40); // Up to 40 hours are regular
        double overtimeHours = Math.max(totalHoursWorked - 40, 0); // Hours worked beyond 40 are overtime
        double regularPay = regularHours * ratePerHour;
        double overtimePay = overtimeHours * (ratePerHour * 1.5);
        return regularPay + overtimePay;
    }

    // Display Employee Information
    public void displayInfo() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    System.out.println("Employee ID: " + empID);
    System.out.println("Employee Name: " + empName);
    System.out.println("Date Hired: " + dateFormat.format(empDateHired));
    System.out.println("Date of Birth: " + dateFormat.format(empBirthDate));
    System.out.println("Total Hours Worked: " + totalHoursWorked + " hours");
    System.out.println("Rate Per Hour: ₱" + ratePerHour);
    System.out.println("Salary: ₱" + computeSalary());
}

    // Override toString method to return employee information
    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName;
    }
}
