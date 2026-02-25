import java.util.Scanner;

class OddOrEven {
    int num;

    void getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
    }

    void check() {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    public static void main(String[] args) {
        OddOrEven obj = new OddOrEven();
        obj.getNumber();
        obj.check();
    }
}