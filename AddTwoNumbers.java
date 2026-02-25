import java.util.Scanner;

class AddTwoNumbers {
    int a, b;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }

    void add() {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();
        obj.getData();
        obj.add();
    }
}