import java.util.*;

class Employee {
    String name, dept;
    double salary;
    static String company = "ABC Ltd";

    Employee(String n, String d, double s){
        name=n; dept=d; salary=s;
    }

    void display(){
        System.out.println(name+" "+dept+" "+salary+" "+company);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e[] = new Employee[5];

        for(int i=0;i<5;i++){
            String n = sc.next();
            String d = sc.next();
            double s = sc.nextDouble();
            e[i] = new Employee(n,d,s);
        }

        for(Employee x:e){
            x.display();
        }
    }
}
