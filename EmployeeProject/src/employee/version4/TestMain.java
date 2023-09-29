package employee.version4;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestMain {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Name[] employeeNames = {
            new Name("John", "Smith"),
            new Name("Alice", "Johnson"),
            new Name("David", "Brown"),
            new Name("Emily", "Davis"),
            new Name("Michael", "Wilson"),
            new Name("Sarah", "Miller")
        };


        Employee employee1 = new HourlyEmployee(1, employeeNames[0], dateFormat.parse("2023-02-10"), dateFormat.parse("1985-06-15"), 23.00F, 38.39F);

        Employee employee2 = new HourlyEmployee(2, employeeNames[1], dateFormat.parse("2023-01-15"), dateFormat.parse("1991-06-21"), 43f, 65f);


        Employee employee3 = new BasePlusCommissionEmployee(3, employeeNames[2].getFullName(), dateFormat.parse("2023-01-15"), dateFormat.parse("1991-06-21"), 55000, 5000);
        Employee employee4 = new BasePlusCommissionEmployee(4, employeeNames[3].getFullName(), dateFormat.parse("2023-02-10"), dateFormat.parse("1986-09-16"), 45000, 3000);
        Employee employee5 = new PieceWorkerEmployee(5, employeeNames[4].getFullName(), dateFormat.parse("2023-03-05"), dateFormat.parse("1992-11-10"), 150, 65.50f);
        Employee employee6 = new PieceWorkerEmployee(6, employeeNames[5].getFullName(), dateFormat.parse("2023-04-20"), dateFormat.parse("1993-07-15"), 200, 50.00f);

        EmployeeRoster roster = new EmployeeRoster();

        roster.addEmployee(employee1);
        roster.addEmployee(employee2);
        roster.addEmployee(employee3);
        roster.addEmployee(employee4);
        roster.addEmployee(employee5);
        roster.addEmployee(employee6);

        roster.displayEmployeeTable();
    }
}
