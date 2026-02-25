import java.util.Scanner;

class Outer {
    int num;

    Outer(int n) {
        num = n;
    }

    class Inner {
        void display() {
            System.out.println("Square of number is: " + (num * num));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Outer obj = new Outer(n);
        Outer.Inner in = obj.new Inner();
        in.display();
    }
}