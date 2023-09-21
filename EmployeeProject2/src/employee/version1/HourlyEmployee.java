package employee.version1;

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
        super(empID, empName, empDateHired, empBirthDate); // Call the superclass constructor
    }

    // Constructor 3: Parameterized constructor with all employee information
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate,
                          float totalHoursWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate); // Call the superclass constructor
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    // Accessors and Mutators specific to HourlyEmployee
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

    // Compute Salary specific to HourlyEmployee
    public double computeSalary() {
        double regularHours = Math.min(totalHoursWorked, 40); // Up to 40 hours are regular
        double overtimeHours = Math.max(totalHoursWorked - 40, 0); // Hours worked beyond 40 are overtime
        double regularPay = regularHours * ratePerHour;
        double overtimePay = overtimeHours * (ratePerHour * 1.5);
        return regularPay + overtimePay;
    }

    // Display Employee Information specific to HourlyEmployee
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Date Hired: " + dateFormat.format(getEmpDateHired()));
        System.out.println("Date of Birth: " + dateFormat.format(getEmpBirthDate()));
        System.out.println("Total Hours Worked: " + totalHoursWorked + " hours");
        System.out.println("Rate Per Hour: ₱" + ratePerHour);
        System.out.println("Salary: ₱" + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Hours Worked: " + totalHoursWorked
                + " hours\nRate Per Hour: ₱" + ratePerHour + "\nSalary: ₱" + computeSalary();
    }
}
