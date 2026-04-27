abstract class MotorVehicle {
    String name;
    int number;
    double price;

    MotorVehicle(String n,int no,double p){
        name=n; number=no; price=p;
    }

    void display(){
        System.out.println(name+" "+number+" "+price);
    }
}

class Car extends MotorVehicle {
    double discountRate = 10;

    Car(String n,int no,double p){
        super(n,no,p);
    }

    void discount(){
        double d = price*discountRate/100;
        System.out.println("Discount: "+d);
    }

    void display(){
        super.display();
        System.out.println("Discount rate: "+discountRate);
    }

    public static void main(String[] args) {
        Car c = new Car("BMW",101,50000);
        c.display();
        c.discount();
    }
}
