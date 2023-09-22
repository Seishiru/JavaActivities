package employee.version2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {
    public static void main(String[] args) throws ParseException {
        // Create a SimpleDateFormat for parsing dates with the new format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        // Create a Date object for hire date and birth date
        Date hireDate = dateFormat.parse("15-01-2023");
        Date birthDate = dateFormat.parse("20-05-1990");

        // Create an instance of HourlyEmployee
        HourlyEmployee employee = new HourlyEmployee();
        employee.setEmpID(1);
        employee.setEmpName("John Doe");
        employee.setEmpDateHired(hireDate);
        employee.setEmpBirthDate(birthDate);
        employee.setTotalHoursWorked(45);
        employee.setRatePerHour(10.0f);

        // Display employee information
        employee.displayInfo();
        
        System.out.println("\n");
        PieceWorkerEmployee WEmployee = new PieceWorkerEmployee();
        
        WEmployee.setEmpID(1);
        WEmployee.setEmpName("Joey");
        WEmployee.setEmpDateHired(hireDate);
        WEmployee.setEmpBirthDate(birthDate);
        WEmployee.setTotalPiecesFinished(2);
        WEmployee.setRatePerPiece(25);
        
        WEmployee.displayInfo();
        System.out.println("\n");
        CommissionEmployee CEmployee = new CommissionEmployee();
        
        CEmployee.setEmpID(3);
        CEmployee.setEmpName("Jhonnatan Whisker");
        CEmployee.setEmpDateHired(hireDate);
        CEmployee.setEmpBirthDate(birthDate);
        CEmployee.setTotalSales(40);
        
        CEmployee.displayInfo();
        System.out.println("\n");
        BasePlusCommissionEmployee BPCEmployee = new BasePlusCommissionEmployee();
        
        BPCEmployee.setEmpID(4);
        BPCEmployee.setEmpName("sennr");
        BPCEmployee.setEmpDateHired(hireDate);
        BPCEmployee.setEmpBirthDate(birthDate);
        BPCEmployee.setBaseSalary(1999);
        BPCEmployee.setTotalSales(345);
        BPCEmployee.displayInfo();
    }
}
