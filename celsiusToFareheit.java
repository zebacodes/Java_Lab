import java.util.Scanner;

class Temperature {
    double celsius, fahrenheit;

    void getTemp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();
    }

    void convert() {
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }

    public static void main(String[] args) {
        Temperature obj = new Temperature();
        obj.getTemp();
        obj.convert();
    }
}