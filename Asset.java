abstract class Asset {
    abstract void displayDetails();
}

class Stock extends Asset {
    void displayDetails(){
        System.out.println("Stock details");
    }
}

class Bond extends Asset {
    void displayDetails(){
        System.out.println("Bond details");
    }
}

class Savings extends Asset {
    void displayDetails(){
        System.out.println("Savings details");
    }
}

public class Main {
    public static void main(String[] args) {
        Asset a;

        a = new Stock();
        a.displayDetails();

        a = new Bond();
        a.displayDetails();

        a = new Savings();
        a.displayDetails();
    }
}
