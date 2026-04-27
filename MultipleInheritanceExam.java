import java.util.*;

// Interface
interface Exam {
    void percent_cal();
}

// Student class
class Student {
    String name;
    int roll;
    int m1, m2;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.next();

        System.out.print("Enter roll no: ");
        roll = sc.nextInt();

        System.out.print("Enter marks1: ");
        m1 = sc.nextInt();

        System.out.print("Enter marks2: ");
        m2 = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks1: " + m1);
        System.out.println("Marks2: " + m2);
    }
}

// Result class
class Result extends Student implements Exam {
    double per;

    public void percent_cal() {
        per = (m1 + m2) / 2.0;
    }

    void displayResult() {
        display(); // call student display
        System.out.println("Percentage: " + per);
    }

    public static void main(String[] args) {
        Result r = new Result();

        r.getData();
        r.percent_cal();
        r.displayResult();
    }
}
