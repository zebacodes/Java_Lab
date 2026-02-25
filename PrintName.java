import java.util.Scanner;

class PrintName {
    String name;

    void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
    }

    void display() {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        PrintName obj = new PrintName();
        obj.getName();
        obj.display();
    }
}