import java.util.Scanner;

class Rectangle {
    int length, breadth;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    void calculate() {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.getData();
        obj.calculate();
    }
}