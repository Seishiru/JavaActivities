package employee.version1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private float ratePerPiece;

    // Constructors
    public PieceWorkerEmployee() {
        // Default constructor
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate,
            int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate); // Call the superclass constructor
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName); // Call the superclass constructor with default dates
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    // Accessors and mutators specific to PieceWorkerEmployee
    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    // Compute salary specific to PieceWorkerEmployee
    public double computeSalary() {
        double salary = totalPiecesFinished * ratePerPiece;
        int bonusCount = totalPiecesFinished / 100;
        double bonus = bonusCount * (10 * ratePerPiece);
        return salary + bonus;
    }

    // Display employee information specific to PieceWorkerEmployee
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Date Hired: " + dateFormat.format(getEmpDateHired()));
        System.out.println("Date of Birth: " + dateFormat.format(getEmpBirthDate()));
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate per Piece: ₱" + ratePerPiece);
        System.out.println("Salary: ₱" + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Pieces Finished: " + totalPiecesFinished
                + "\nRate per Piece: $" + ratePerPiece + "\nSalary: $" + computeSalary();
    }
}
