public class Employee {
    private final String employeeFirstName;
    private final String employeeLastName;
    private final String employeeMiddleName;
    private int department;
    private int employeeSalary;
    private static int counter = 1;
    private final int id;

    public Employee(String employeeLastName, String employeeFirstName, String employeeMiddleName, int department, int employeeSalary) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeMiddleName = employeeMiddleName;
        this.department = department;
        this.employeeSalary = employeeSalary;
        id = counter++;

    }

    public String getFirstName() {
        return this.employeeFirstName;
    }

    public String getLastName() {
        return this.employeeLastName;
    }
    public String getMiddleName() {
        return this.employeeMiddleName;
    }
    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.employeeSalary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String toString() {
        return "Ф.И.О. - " + employeeLastName + ' ' + employeeFirstName + ' ' + employeeMiddleName + ", отедел - " + department
                + ", зарплата - " + employeeSalary + " руб.";
    }
}
