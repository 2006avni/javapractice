class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class EmployeeCountDemo {
    public static void main(String[] args) {
        new Employee("A", 1);
        new Employee("B", 2);
        new Employee("C", 3);

        Employee.displayCount();
    }
}
