package employee.version1;

import java.util.Date;

// Employee class (Base class)
public class Employee {
    private int empID;
    private String empName;
    private Date empBirthDate;
    private Date empDateHired;  // New attribute for date of hire
    
    // Constructors, getters, setters, and common methods
}

// EmployeeRoster class (if needed)
public class EmployeeRoster {
    // Manage a list of Employee objects
    // You can add methods for adding, removing, and listing employees
}

// HourlyEmployee class (Inherits from Employee)
public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;

    // Constructors, getters, setters, and methods for hourly employees
}

// PieceWorkerEmployee class (Inherits from Employee)
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private float ratePerPiece;

    // Constructors, getters, setters, and methods for pieceworker employees
}

// CommissionEmployee class (Inherits from Employee)
public class CommissionEmployee extends Employee {
    private double totalSales;

    // Constructors, getters, setters, and methods for commission-based employees
}

// BasePlusCommissionEmployee class (Inherits from CommissionEmployee)
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    // Constructors, getters, setters, and methods for base plus commission employees
}
