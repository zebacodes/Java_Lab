import java.util.Scanner;

class PositiveNegative {
    int num;

    PositiveNegative(int n) {
        num = n;
    }

    void check() {
        if (num > 0)
            System.out.println("Positive Number");
        else if (num < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PositiveNegative obj = new PositiveNegative(n);
        obj.check();
    }
}