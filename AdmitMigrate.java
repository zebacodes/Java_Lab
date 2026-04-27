import java.util.Scanner;

// Interface
interface Department {
    String deptName = "CSE";
    String deptHead = "Dr. Sharma";

    void printDept();
}

// Hostel class
class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.next();

        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.next();

        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
    }

    void printHostelData() {
        System.out.println("Hostel: " + hostelName + ", " + hostelLocation + ", Rooms: " + numberOfRooms);
    }
}

// Student class
class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.next();

        System.out.print("Enter Reg No: ");
        regdNo = sc.nextInt();

        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.next();

        System.out.print("Enter Avg Marks: ");
        avgMarks = sc.nextDouble();

        getHostelData(sc);
    }

    void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Reg No: " + regdNo);
        System.out.println("Subject: " + electiveSubject);
        System.out.println("Marks: " + avgMarks);

        printHostelData();
        printDept();
    }

    public void printDept() {
        System.out.println("Department: " + deptName + ", Head: " + deptHead);
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        int choice;

        do {
            System.out.println("\n1. Admit New Student");
            System.out.println("2. Migrate Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.getData(sc);
                    break;

                case 2:
                    System.out.print("Enter Reg No to search: ");
                    int search = sc.nextInt();

                    if (search == s.regdNo) {
                        System.out.println("Student Found. Migrated Successfully.");
                    } else {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 3:
                    s.printData();
                    break;
            }

        } while (choice != 4);
    }
}
