import java.util.Scanner;

class Factorial {
    
    int findFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Factorial obj = new Factorial();
        int result = obj.findFactorial(num);

        System.out.println("Factorial of " + num + " is: " + result);
    }
}