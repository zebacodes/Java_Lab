import java.util.Scanner;

// Sales Interface
interface SalesDepartment {
    void processSale(double amount);
}

// Finance Interface
interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

// Class implementing both interfaces
class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale Amount: " + amount);
        System.out.println("Sale processed successfully.");
    }

    public void generateInvoice(String clientName, double amount) {
        System.out.println("Invoice Generated");
        System.out.println("Client Name: " + clientName);
        System.out.println("Amount: " + amount);
    }

    void showSummary() {
        System.out.println("Summary: All commercial operations completed successfully.");
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CommercialExecutive ce = new CommercialExecutive();

        System.out.print("Enter Client Name: ");
        String name = sc.next();

        System.out.print("Enter Sale Amount: ");
        double amount = sc.nextDouble();

        ce.processSale(amount);
        ce.generateInvoice(name, amount);
        ce.showSummary();
    }
}
