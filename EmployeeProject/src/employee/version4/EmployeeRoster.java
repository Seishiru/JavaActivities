package employee.version4;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRoster {
    private final List<Employee> employees;

    public EmployeeRoster() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void displayEmployeeTable() {
        List<Employee> employees = this.getEmployees();

        System.out.println("Employee Roster:");
        printTableHeader();

        for (Employee employee : employees) {
            printEmployeeRow(employee);
        }

        printTableFooter();
    }

    private void printTableHeader() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-25s | %-28s | %-28s | %-20s | %-16s | %-26s |\n", "ID", "Name", "Date Hired", "Date of Birth", "Type", "Salary", "Specific Info");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private void printEmployeeRow(Employee employee) {
        System.out.printf("| %-5d | %-25s | %-28s | %-28s | %-20s | $%-15.2f | %-26s |\n",
                employee.getEmpID(),
                employee.getEmpName(),
                employee.getEmpDateHired(),
                employee.getEmpBirthDate(),
                employee.getType(),
                employee.computeSalary(),
                getSpecificInfo(employee));
    }

    private void printTableFooter() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    private String getSpecificInfo(Employee employee) {
        if (employee instanceof HourlyEmployee) {
            return "Hours Worked: " + ((HourlyEmployee) employee).getTotalHoursWorked();
        } else if (employee instanceof BasePlusCommissionEmployee) {
            return "Base Salary: $" + ((BasePlusCommissionEmployee) employee).getBaseSalary();
        } else if (employee instanceof PieceWorkerEmployee) {
            return "Total Pieces Finished: " + ((PieceWorkerEmployee) employee).getTotalPiecesFinished();
        } else if (employee instanceof CommissionEmployee) {
            return "Total Sales: $" + ((CommissionEmployee) employee).getTotalSales();
        } else {
            return "Unknown Type";
        }
    }
}
