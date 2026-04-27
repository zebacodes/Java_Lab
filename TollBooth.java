class Toll {
    int totalCars=0;
    int unpaidCars=0;
    int money=0;

    void payingCar(){
        totalCars++;
        money += 50;
    }

    void nonPayingCar(){
        totalCars++;
        unpaidCars++;
    }

    void display(){
        System.out.println("Total cars: "+totalCars);
        System.out.println("Unpaid cars: "+unpaidCars);
        System.out.println("Money: "+money);
    }

    public static void main(String[] args) {
        Toll t = new Toll();

        t.payingCar();
        t.payingCar();
        t.nonPayingCar();

        t.display();
    }
}
