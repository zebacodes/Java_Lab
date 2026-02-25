import java.util.Scanner;

class Swap {
    int a, b;

    Swap(int x, int y) {
        a = x;
        b = y;
    }

    void swapNumbers() {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Swap obj1 = new Swap(x, y);
        obj1.swapNumbers();
    }
}