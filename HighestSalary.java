import java.util.*;

class Employee {
    int emp_no;
    String name, dept;
    double basic, da, hra, gross;

    Employee(int e,String n,String d,double b){
        emp_no=e; name=n; dept=d; basic=b;

        da = 0.1*basic;
        hra = 0.2*basic;
        gross = basic + da + hra;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e[] = new Employee[3];

        for(int i=0;i<3;i++){
            e[i]= new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
        }

        double max=0;
        String name="";

        for(Employee x:e){
            if(x.gross>max){
                max=x.gross;
                name=x.name;
            }
        }

        System.out.println("Highest salary: "+name);
    }
}
