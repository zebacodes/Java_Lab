import java.util.Scanner;

class Maximum {
    int a, b, c;

    Maximum(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void findMax() {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Maximum number is: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        Maximum obj = new Maximum(x, y, z);
        obj.findMax();
    }
}