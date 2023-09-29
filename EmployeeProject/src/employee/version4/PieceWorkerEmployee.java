package employee.version4;

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
        super(empID, empName, empDateHired, empBirthDate); 
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, float ratePerPiece) {
        this(empID, empName, new Date(), new Date(), totalPiecesFinished, ratePerPiece);
    }

    // Accessors and mutators
    
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

    // Compute salary
    @Override
    public double computeSalary() {
        double salary = totalPiecesFinished * ratePerPiece;
        if (totalPiecesFinished >= 100) {
            salary = ((double) totalPiecesFinished / 100) * 10 * ratePerPiece;
        }
        return salary;
    }

    @Override
    public String getType() {
        return "PieceWorker";
    }

    // Display employee information
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate per Piece: $" + ratePerPiece);
        System.out.println("Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nDate Hired: " + empDateHired
                + "\nDate of Birth: " + empBirthDate + "\nTotal Pieces Finished: " + totalPiecesFinished
                + "\nRate per Piece: $" + ratePerPiece + "\nSalary: $" + computeSalary();
    }
}

