package employee.version5;

import java.util.Date;

public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;
    // Constructor 1: Default constructor
    public HourlyEmployee() {
    }

    // Constructor 2: Parameterized constructor with basic employee information
    // public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
    //     super(empID, empName, empDateHired, empBirthDate);
    // }

    // Constructor 3: Parameterized constructor with all employee information and default values
    public HourlyEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, empName.getFullName(), empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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
    @Override
    public double computeSalary() {
        double salary = totalHoursWorked * ratePerHour;
        if (totalHoursWorked > 40) {
            salary += (totalHoursWorked - 40) * ratePerHour * 1.5;
        }
        return salary;
    }

    @Override
    public String getType() {
        return "Hourly";
    }

    // Display Employee Information
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Total Hours Worked: " + totalHoursWorked + " hours");
    System.out.println("Rate Per Hour: $" + ratePerHour);
    System.out.println("Salary: $" + computeSalary());
}

    // Override toString method to return employee information

}
