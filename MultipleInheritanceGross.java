import java.util.Scanner;

// Gross Interface
interface Gross {
    double calculateGross(double basic, double hra, double da);
}

// Employee class
class Employee {
    String name;
    int id;

    void getEmployeeData(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        name = sc.next();

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Salary class implementing Gross
class Salary extends Employee implements Gross {
    double basic, hra, da, grossSalary;

    void getSalaryData(Scanner sc) {
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }

    public double calculateGross(double basic, double hra, double da) {
        return basic + hra + da;
    }

    void displaySalary() {
        grossSalary = calculateGross(basic, hra, da);

        displayEmployee();
        System.out.println("Gross Salary: " + grossSalary);
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Salary s = new Salary();

        s.getEmployeeData(sc);
        s.getSalaryData(sc);

        s.displaySalary();
    }
}
