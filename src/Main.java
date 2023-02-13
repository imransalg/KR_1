public class Main  {
    public static void printSeparator() {
        System.out.println("------------------");
    }
    public static void printAllEmployee(Employee[] emps) {
        for (int i = 0; i < emps.length - 1; i++) {
            System.out.println(emps[i]);
        }
    }

    public static void sumMonthlySalary(Employee[] emps) {
        int sum = 0;
        for (int i = 0; i < emps.length; i++) {
            sum += emps[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц = " + sum + " руб.");
    }

    public static void findEmpWithMinSalary(Employee[] emps) {
        Employee employeeWithMinSalary = emps[0];
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = emps[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMinSalary);
    }
    public static void findEmpWithMaxSalary(Employee[] emps) {
        Employee employeeWithMaxSalary = emps[0];
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = emps[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary);
    }

    public static void calculateAverageMonthlySalary(Employee[] emps) {
        int totalCosts = 0;
        for (int i = 0; i < emps.length; i++) {
            totalCosts += emps[i].getSalary();
        }
        double averageCost =(float) totalCosts / emps.length;
        System.out.println("Среднее значение зарплат за месяц " + averageCost + " руб.");
    }

    public static void getFullNameAllEmps (Employee[] emps) {
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].getLastName() + ' ' + emps[i].getFirstName() + ' ' + emps[i].getMiddleName());
        }
    }
    public static void main(String[] args) {
        Employee[] emps = new Employee[10];
        emps[0] = new Employee("Иванов", "Иван", "Иванович", 1, 30000);
        emps[1] = new Employee("Сергеев", "Сергей", "Сергеевич", 2, 37000);
        emps[2] = new Employee("Алексеев", "Алексей", "Алексеевич", 1, 35000);
        emps[3] = new Employee("Даниилов", "Даниил", "Даниилович", 3, 33000);
        emps[4] = new Employee("Ахмедов", "Ахмед", "Ахмедович", 3, 42000);
        emps[5] = new Employee("Алайцев", "Егор", "Егорович", 2, 43000);
        emps[6] = new Employee("Егоров", "Никита", "Никитич", 1, 40000);
        emps[7] = new Employee("Суслов", "Иван", "Георгиевич", 4, 50000);
        emps[8] = new Employee("Иванов", "Алексей", "Иванович", 5, 60000);
        emps[9] = new Employee("Сергеев", "Константин", "Русланович", 5, 65000);
        printAllEmployee(emps);
        printSeparator();
        sumMonthlySalary(emps);
        printSeparator();
        findEmpWithMinSalary(emps);
        printSeparator();
        findEmpWithMaxSalary(emps);
        printSeparator();
        calculateAverageMonthlySalary(emps);
        printSeparator();
        getFullNameAllEmps(emps);
    }

}