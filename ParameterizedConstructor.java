import java.util.*;

class Para {
    Para(int x){
        System.out.println("Value is: " + x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Para obj = new Para(a);
    }
}
