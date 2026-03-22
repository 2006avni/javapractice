abstract class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    double incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id, salary);
        this.incentive = incentive;
    }

    double calculateBonus() {
        return (salary * 0.10) + incentive;
    }
}

public class EmployeeBonusDemo {
    public static void main(String[] args) {
        Employee e;

        e = new Manager("Amit", 1, 50000);
        System.out.println("Manager Bonus: " + e.calculateBonus());

        e = new Developer("Ravi", 2, 40000, 5000);
        System.out.println("Developer Bonus: " + e.calculateBonus());
    }
}